package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.VoieDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Voie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class VoieImpl extends AbstractDataImpl implements VoieDao {

    @Override
    public List<Voie> voies() {
        String vSql = "SELECT * FROM public.voie";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Voie> voieRowMapper = new RowMapper<Voie>() {
            @Override
            public Voie mapRow(ResultSet pRs, int rowNum) throws SQLException {
                Voie vVoie = new Voie();
                vVoie.setNom(pRs.getString("nom"));
                vVoie.setCotation(pRs.getString("cotation"));
                vVoie.setType(pRs.getString("type"));
                vVoie.setHauteur(pRs.getFloat("hauteur"));
                return vVoie;
            }
        };
        List<Voie> vListVoie = vJdbcTemplate.query(vSql, voieRowMapper);
        return vListVoie;
    }

    @Override
    public String addVoie(Voie voie) {
        return null;
    }

    @Override
    public Voie voie(Integer id) {
        return null;
    }

    @Override
    public String delVoie(Integer id) {
        return null;
    }

    @Override
    public String upVoie(Voie voie) {
        return null;
    }
}
