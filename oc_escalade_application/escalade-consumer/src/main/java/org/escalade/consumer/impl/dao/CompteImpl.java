package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.CompteDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.CompteRM;
import org.escalade.model.bean.Compte;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CompteImpl extends AbstractDataImpl implements CompteDao {

    @Override
    public List<Compte> comptes() {

        String vSql = "SELECT * FROM public.compte";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        CompteRM vCompteRM = new CompteRM();


        List<Compte> vListeCompte = vJdbcTemplate.query(vSql, vCompteRM.getvCompteRowMapper());
        return vListeCompte;
    }

    @Override
    public void addCompte(Compte compte) {

        String vSql = "INSERT INTO public.compte(nom, prenom, mail, mot_de_passe) VALUES"
                    + " (:nom, :prenom, :mail, :mot_de_passe)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", compte.getNom());
        vParams.addValue("prenom", compte.getPrenom());
        vParams.addValue("mail", compte.getMail());
        vParams.addValue("mot_de_passe", compte.getMot_de_passe());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        int vNbrLigneMaj = vJdbcTemplate.update(vSql, vParams);
    }

    @Override
    public Compte compte(Compte compte_id) {


        String vSql = "SELECT * FROM public.compte"
                    + " WHERE id = " + compte_id.getId();

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        CompteRM vCompteRM = new CompteRM();

        List<Compte> vCompteDetail = vJdbcTemplate.query(vSql, vCompteRM.getvCompteRowMapper());
        return vCompteDetail.get(0);
    }

    @Override
    public String delCompte(Integer id) {
        return null;
    }

    @Override
    public void upCompte(Compte upCompte, Compte compte) {

        String vSql = "UPDATE public.compte SET"
                    + " nom = :nom, prenom = :prenom, mail = :mail, mot_de_passe = :mot_de_passe"
                    + " WHERE id = :id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", compte.getId());
        vParams.addValue("nom", upCompte.getNom());
        vParams.addValue("prenom", upCompte.getPrenom());
        vParams.addValue("mail", upCompte.getMail());
        vParams.addValue("mot_de_passe", upCompte.getMot_de_passe());


        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrLigneMaj = vJdbcTemplate.update(vSql, vParams);
    }

    @Override
    public Compte comptByUtilisateur(String login, String password) {
        String vSql = "SELECT * FROM public.compte"
                    + " WHERE mail = " + "'" + login + "'"
                    + " AND mot_de_passe = " + "'" + password + "'";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        CompteRM vCompteRM = new CompteRM();

        List<Compte> vUtilisateur = vJdbcTemplate.query(vSql, vCompteRM.getvCompteRowMapper());
        return vUtilisateur.get(0);
    }
}
