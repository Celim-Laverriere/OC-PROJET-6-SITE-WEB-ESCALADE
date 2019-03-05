package org.escalade.consumer.impl.rowmapper;

import org.escalade.model.bean.Topo;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TopoRM {

    public RowMapper<Topo> getvTopoRowMapper() {
        return vTopoRowMapper;
    }

    RowMapper<Topo> vTopoRowMapper = new RowMapper<Topo>() {
        @Override
        public Topo mapRow(ResultSet pRs, int rowNum) throws SQLException {
            Topo vTopo = new Topo();
            vTopo.setId(pRs.getInt("id"));
            vTopo.setNom(pRs.getString("nom"));
            vTopo.setDate_upload(pRs.getDate("date_upload"));
            vTopo.setDescription(pRs.getString("description"));
            vTopo.setUrl_topo(pRs.getString("url_topo"));
            return vTopo;
        }
    };
}
