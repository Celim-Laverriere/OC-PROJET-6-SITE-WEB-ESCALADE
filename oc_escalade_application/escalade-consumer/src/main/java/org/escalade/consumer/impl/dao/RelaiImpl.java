package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.RelaiDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Relai;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RelaiImpl extends AbstractDataImpl implements RelaiDao {

    @Override
    public List<Relai> relais(Integer voie_id) {

        String vSql
                = "SELECT * FROM public.relai"
                + " WHERE voie_id = " + voie_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Relai> relaiRowMapper = new RowMapper<Relai>() {
            @Override
            public Relai mapRow(ResultSet pRs, int rowNum) throws SQLException {
                Relai vRelai = new Relai();
                vRelai.setId(pRs.getInt("id"));
                vRelai.setNum_relai(pRs.getInt("num_relai"));
                vRelai.setHauteur(pRs.getFloat("hauteur"));
                return vRelai;
            }
        };
        List<Relai> vListRelai = vJdbcTemplate.query(vSql, relaiRowMapper);
        return vListRelai;
    }

    @Override
    public String addRelai(Relai relai) {
        return null;
    }

    @Override
    public Relai relai(Integer id) {
        return null;
    }

    @Override
    public String delRelai(Integer id) {
        return null;
    }

    @Override
    public String upRelai(Integer id, Relai relai) {
        return null;
    }
}
