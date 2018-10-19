package org.escalade.business.contract.manager;

import org.escalade.model.bean.Topo;

import java.util.List;

public interface TopoManager {

    List<Topo> topos();

    String addTopo(Topo topo);

    Topo topo(Integer topo_id);

    String delTopo(Integer id);

    String upTopo(Integer id, Topo topo);
}
