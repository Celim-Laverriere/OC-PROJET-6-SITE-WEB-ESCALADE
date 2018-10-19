package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.ResaTopoDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.ResaTopoRM;
import org.escalade.model.bean.ResaTopo;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ResaTopoImpl extends AbstractDataImpl implements ResaTopoDao {

    @Override
    public List<ResaTopo> resaTopos(Integer compte_id, Integer topo_id) {

        String vSql = null;

                if (compte_id != null) {
                   vSql
                           = "SELECT * FROM public.resa_topo"
                           + " WHERE compte_id = " + compte_id;
                }

                if (topo_id != null){
                    vSql
                            = "SELECT * FROM public.resa_topo"
                            + " WHERE topo_id = " + topo_id;
                }

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        ResaTopoRM resaTopoRM = new ResaTopoRM();

        List<ResaTopo> vListResaTopo = vJdbcTemplate.query(vSql, resaTopoRM.getvResaTopoRowMapper());
        return vListResaTopo;
    }

    @Override
    public String addResaTopo(ResaTopo resaTopo) {
        return null;
    }

    @Override
    public ResaTopo resaTopo(Integer compte_id, Integer topo_id) {
        String vSql = null;

        if (compte_id != null) {
            vSql
                    = "SELECT * FROM public.resa_topo"
                    + " WHERE compte_id = " + compte_id;
        }

        if (topo_id != null){
            vSql
                    = "SELECT * FROM public.resa_topo"
                    + " WHERE topo_id = " + topo_id;
        }

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        ResaTopoRM resaTopoRM = new ResaTopoRM();

        List<ResaTopo> vResaTopo = vJdbcTemplate.query(vSql, resaTopoRM.getvResaTopoRowMapper());
        return vResaTopo.get(0);
    }

    @Override
    public String delResaTopo(Integer id) {
        return null;
    }
}
