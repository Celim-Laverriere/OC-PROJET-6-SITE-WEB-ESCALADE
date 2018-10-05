package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.TopoDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Topo;

import java.util.List;

public class TopoImpl extends AbstractDataImpl implements TopoDao {

    @Override
    public List<Topo> topos() {
        return null;
    }

    @Override
    public String addTopo(Topo topo) {
        return null;
    }

    @Override
    public Topo topo(Integer id) {
        return null;
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
