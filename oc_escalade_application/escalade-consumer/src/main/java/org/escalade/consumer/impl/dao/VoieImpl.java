package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.VoieDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.VoieRM;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Voie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class VoieImpl extends AbstractDataImpl implements VoieDao {

    @Override
    public List<Voie> voies(Integer secteur_id) {

        String vSql = "SELECT * FROM public.voie"
                    + " WHERE secteur_id = " + secteur_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        VoieRM voieRM = new VoieRM();

        List<Voie> vListVoie = vJdbcTemplate.query(vSql, voieRM.getVoieRowMapper());
        return vListVoie;
    }

    @Override
    public void addVoie(Voie voie, Secteur secteur) {

        String vSql = "INSERT INTO public.voie (nom, description, type_voie, cotation, hauteur, secteur_id) VALUES"
                    + " (:nom, :description, :type_voie, :cotation, :hauteur, :secteur_id)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("nom", voie.getNom());
        vParams.addValue("description", voie.getDescription());
        vParams.addValue("type_voie", voie.getType_voie());
        vParams.addValue("cotation", voie.getCotation());
        vParams.addValue("hauteur", voie.getHauteur());
        vParams.addValue("secteur_id", secteur.getId());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        vJdbcTemplate.update(vSql, vParams);
    }

    @Override
    public Voie voie(Integer id) {
        String vSql
                = "SELECT * FROM public.voie"
                + " WHERE id = " + id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        VoieRM vVoieRM = new VoieRM();

        List<Voie> vListVoie = vJdbcTemplate.query(vSql, vVoieRM.getVoieRowMapper());
        return vListVoie.get(0);
    }

    @Override
    public String delVoie(Integer id) {
        return null;
    }

    @Override
    public String upVoie(Voie voie) {
        return null;
    }

    /**
     * Recherche dans la table "voie" une correspondance
     * dans la colonne "nom" avec la saissi de l'utilisateur.
     * @param motCleRecherche
     * @return vListVoie
     */
    @Override
    public List<Voie>  rechercheSimpleParVoieDao(String motCleRecherche) {

        String vSql = "SELECT * FROM public.voie"
                + " WHERE nom LIKE " + "'" + motCleRecherche + "%" + "'";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        VoieRM vVoieRM = new VoieRM();

        List<Voie> vListVoie = vJdbcTemplate.query(vSql, vVoieRM.getVoieRowMapper());
        return vListVoie;
    }

    public Voie recoversVoieWorkflowDao(Voie voie, Secteur secteur){

        String vSql = "SELECT * FROM public.voie"
                    + " WHERE nom = '" + voie.getNom() + "'"
                    + " AND type_voie = '" + voie.getType_voie() + "'"
                    + " AND cotation = '" + voie.getCotation() + "'"
                    + " AND  hauteur = '" + voie.getHauteur() + "'"
                    + " AND secteur_id = " + secteur.getId();

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        VoieRM vVoieRM = new VoieRM();

        List<Voie> vVoie = vJdbcTemplate.query(vSql, vVoieRM.getVoieRowMapper());
        return vVoie.get(0);
    }
}
