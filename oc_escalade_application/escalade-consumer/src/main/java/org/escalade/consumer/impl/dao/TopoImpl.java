package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.TopoDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.TopoRM;
import org.escalade.model.bean.Topo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TopoImpl extends AbstractDataImpl implements TopoDao {

    @Override
    public List<Topo> topos() {
        String vSql = "SELECT * FROM public.topo";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        TopoRM topoRM = new TopoRM();

        List<Topo> vListTopo = vJdbcTemplate.query(vSql, topoRM.getvTopoRowMapper());
        return vListTopo;
    }

    @Override
    public String addTopo(Topo topo) {
        return null;
    }

    @Override
    public Topo topo(Integer topo_id) {
        String vSql
                = "SELECT * FROM public.topo"
                + " WHERE id = " + topo_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        TopoRM topoRM = new TopoRM();

        List<Topo> vListTopo = vJdbcTemplate.query(vSql, topoRM.getvTopoRowMapper());
        return vListTopo.get(0);
    }

    @Override
    public String delTopo(Integer id) {
        return null;
    }

    @Override
    public String upTopo(Integer id, Topo topo) {
        return null;
    }
}
