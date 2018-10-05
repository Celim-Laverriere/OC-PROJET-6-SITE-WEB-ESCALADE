package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.TopoManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Topo;

import java.util.List;

public class TopoManagerImplImpl extends AbstractManagerImpl implements TopoManager {

    @Override
    public List<Topo> topos() {
        return getDaoFactory().getTopoDao().topos();
    }

    @Override
    public String addTopo(Topo topo) {
        return getDaoFactory().getTopoDao().addTopo(topo);
    }

    @Override
    public Topo topo(Integer id) {
        return getDaoFactory().getTopoDao().topo(id);
    }

    @Override
    public String delTopo(Integer id) {
        return getDaoFactory().getTopoDao().delTopo(id);
    }

    @Override
    public String upTopo(Integer id, Topo topo) {
        return getDaoFactory().getTopoDao().upTopo(id, topo);
    }
}
