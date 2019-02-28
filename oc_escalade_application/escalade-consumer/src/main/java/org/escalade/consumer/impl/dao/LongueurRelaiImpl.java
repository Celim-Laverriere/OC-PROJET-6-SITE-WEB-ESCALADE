package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.LongueurRelaiDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.LongueurRM;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.LongueurRelai;
import org.escalade.model.bean.Voie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LongueurRelaiImpl extends AbstractDataImpl implements LongueurRelaiDao {

    @Override
    public List<LongueurRelai> longueursRelai(Integer voie_id) {

        String vSql = "SELECT * FROM public.longueur_relai"
                    + " WHERE voie_id = " + voie_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        LongueurRM vLongueurRM = new LongueurRM();

        List<LongueurRelai> vListLongueurRelai = vJdbcTemplate.query(vSql, vLongueurRM.getvLongueurRelaiRowMapper());
        return vListLongueurRelai;
    }

    @Override
    public void addLongueurRelai(LongueurRelai longueur, Voie voie) {

        String vSql = "INSERT INTO public.longueur_relai (num_longueur, num_relai, hauteur, cotation, voie_id) VALUES "
                    + " (:num_longueur, :num_relai, :hauteur, :cotation, :voie_id)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("num_longueur", longueur.getNum_longueur());
        vParams.addValue("num_relai", longueur.getNum_relai());
        vParams.addValue("hauteur", longueur.getHauteur());
        vParams.addValue("cotation", longueur.getCotation());
        vParams.addValue("voie_id", voie.getId());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSql, vParams);

    }

    @Override
    public LongueurRelai longueurRelai(Integer id) {
        return null;
    }

    /**
     * Supprimer une longueur d'une voie
     * @param id
     * @return un message de confirmation
     */
    @Override
    public void delLongueurRelai(Integer id) {

        String vSql = "DELETE FROM  public.longueur_relai"
                    + " WHERE id = :id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", id);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        vJdbcTemplate.update(vSql, vParams);
    }

    /**
     *Mettre à jour une longueur et un relai d'une voie
     * @param id
     * @return un message de confirmation
     */
    @Override
    public String upLongueur(Integer id, LongueurRelai longueur) {
        return null;
    }

    public List<LongueurRelai> listLongueursByVoieDao(Voie voie){

        String vSql = "SELECT longueur_relai.* FROM public.longueur_relai"
                    + " INNER JOIN voie ON voie.id = " + voie.getId()
                    + " WHERE longueur_relai.voie_id = voie.id";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        LongueurRM vLongueurRM = new LongueurRM();

        List<LongueurRelai> listLongueurRelai = vJdbcTemplate.query(vSql, vLongueurRM.getvLongueurRelaiRowMapper());
        return listLongueurRelai;
    }

//    public List<LongueurRelai> recoversLongueurWorkflowDao(LongueurRelai longueurRelai, Voie voie){
//
//        String vSql = "SELECT * FROM public.longueur_relai"
//                    + " WHERE num_longueur = " + longueurRelai.getNum_longueur()
//                    + " AND  cotation = '" + longueurRelai.getCotation() + "'"
//                    + " AND  hauteur = '" + longueurRelai.getHauteur() + "'"
//                    + " AND  voie_id = " + voie.getId();
//
//        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
//        LongueurRM vLongueurRM = new LongueurRM();
//
//        List<LongueurRelai> vListLongueur = vJdbcTemplate.query(vSql, vLongueurRM.getvLongueurRelaiRowMapper());
//        return vListLongueur;
//    }
}
