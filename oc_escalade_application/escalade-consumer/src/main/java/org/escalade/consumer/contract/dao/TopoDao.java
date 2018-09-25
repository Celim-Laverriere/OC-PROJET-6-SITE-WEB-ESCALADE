package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Longueur;
import org.escalade.model.bean.Topo;

import java.util.List;

public interface TopoDao {

    /**
     * Renvoie le/les topo(s) demandée(s)
     *
     * @return Le {@link Topo}
     */
    List<Topo> getRead();

    /**
     * Créé un topo
     *
     */
    List <Topo> setCreate();
}
