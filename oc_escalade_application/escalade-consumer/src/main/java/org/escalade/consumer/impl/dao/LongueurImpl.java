package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.LongueurDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Longueur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LongueurImpl extends AbstractDataImpl implements LongueurDao {

    @Override
    public List<Longueur> longueurs(Integer voie_id) {
        String vSql
                = "SELECT * FROM public.longueur"
                + " WHERE voie_id = " + voie_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Longueur> vLongueurRowMapper = new RowMapper<Longueur>() {
            @Override
            public Longueur mapRow(ResultSet pRs, int rowNum) throws SQLException {
                Longueur vLongueur = new Longueur();
                vLongueur.setId(pRs.getInt("id"));
                vLongueur.setNumero(pRs.getInt("numero"));
                vLongueur.setHauteur(pRs.getFloat("hauteur"));
                vLongueur.setCotation(pRs.getString("cotation"));
                return vLongueur;
            }
        };
        List<Longueur> vListLongueur = vJdbcTemplate.query(vSql, vLongueurRowMapper);
        return vListLongueur;
    }

    @Override
    public String addLongueur(Longueur longueur) {
        return null;
    }

    @Override
    public Longueur longueur(Integer id) {
        return null;
    }

    @Override
    public String delLongueur(Integer id) {
        return null;
    }

    @Override
    public String upLongueur(Integer id, Longueur longueur) {
        return null;
    }
}
