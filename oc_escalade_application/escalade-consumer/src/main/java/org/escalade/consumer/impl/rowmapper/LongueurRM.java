package org.escalade.consumer.impl.rowmapper;

import org.escalade.model.bean.LongueurRelai;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LongueurRM {

    public RowMapper<LongueurRelai> getvLongueurRelaiRowMapper() {
        return vLongueurRelaiRowMapper;
    }

    private RowMapper<LongueurRelai> vLongueurRelaiRowMapper = new RowMapper<LongueurRelai>() {
        @Override
        public LongueurRelai mapRow(ResultSet pRs, int rowNum) throws SQLException {
            LongueurRelai vLongueurRelai = new LongueurRelai();
            vLongueurRelai.setId(pRs.getInt("id"));
            vLongueurRelai.setNum_longueur(pRs.getInt("num_longueur"));
            vLongueurRelai.setNum_relai(pRs.getInt("num_relai"));
            vLongueurRelai.setHauteur(pRs.getFloat("hauteur"));
            vLongueurRelai.setCotation(pRs.getString("cotation"));
            vLongueurRelai.setVoie_id(pRs.getInt("voie_id"));
            return vLongueurRelai;
        }
    };
}
