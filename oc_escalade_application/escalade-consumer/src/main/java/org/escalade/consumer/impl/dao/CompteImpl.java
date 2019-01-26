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
        CompteRM compteRM = new CompteRM();


        List<Compte> vListeCompte = vJdbcTemplate.query(vSql, compteRM.getvCompteRowMapper());
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
    public Compte compte(Integer id) {
        return null;
    }

    @Override
    public String delCompte(Integer id) {
        return null;
    }

    @Override
    public String upCompte(Integer id, Compte compte) {
        return null;
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
