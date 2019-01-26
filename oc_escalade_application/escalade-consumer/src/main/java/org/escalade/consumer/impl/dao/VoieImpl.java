package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.VoieDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.VoieRM;
import org.escalade.model.bean.Voie;
import org.springframework.jdbc.core.JdbcTemplate;
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
    public String addVoie(Voie voie) {
        return null;
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

    @Override
    public Voie voieByMotCleRecherche(String motCleRecherche) {

        String vSql = "SELECT * FROM public.voie"
                + " WHERE nom = " + "'" + motCleRecherche + "'";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        VoieRM vVoieRM = new VoieRM();

        List<Voie> vListVoie = vJdbcTemplate.query(vSql, vVoieRM.getVoieRowMapper());
        return vListVoie.get(0);
    }
}
