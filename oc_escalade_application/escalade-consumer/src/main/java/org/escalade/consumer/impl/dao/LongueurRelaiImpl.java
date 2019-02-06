package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.LongueurRelaiDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.LongueurRelai;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LongueurRelaiImpl extends AbstractDataImpl implements LongueurRelaiDao {

    @Override
    public List<LongueurRelai> longueursRelai(Integer voie_id) {
        String vSql
                = "SELECT * FROM public.longueur_relai"
                + " WHERE voie_id = " + voie_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<LongueurRelai> vLongueurRowMapper = new RowMapper<LongueurRelai>() {
            @Override
            public LongueurRelai mapRow(ResultSet pRs, int rowNum) throws SQLException {
                LongueurRelai vLongueurRelai = new LongueurRelai();
                vLongueurRelai.setId(pRs.getInt("id"));
                vLongueurRelai.setNum_longueur(pRs.getInt("num_longueur"));
                vLongueurRelai.setNum_relai(pRs.getInt("num_relai"));
                vLongueurRelai.setHauteur(pRs.getFloat("hauteur"));
                vLongueurRelai.setCotation(pRs.getString("cotation"));
                return vLongueurRelai;
            }
        };
        List<LongueurRelai> vListLongueurRelai = vJdbcTemplate.query(vSql, vLongueurRowMapper);
        return vListLongueurRelai;
    }

    @Override
    public String addLongueurRelai(LongueurRelai longueur) {
        return null;
    }

    @Override
    public LongueurRelai longueurRelai(Integer id) {
        return null;
    }

    @Override
    public String delLongueurRelai(Integer id) {
        return null;
    }

    @Override
    public String upLongueurRelai(Integer id, LongueurRelai longueur) {
        return null;
    }
}
