package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Longueur;
import org.escalade.model.bean.ResaTopo;

import java.util.List;

public interface ResaTopoDao {

    /**
     * Renvoie le/les reservation(s) du/des topo(s) demandée(s)
     *
     * @return Le {@link ResaTopo}
     */
    List<ResaTopo> getRead();

    /**
     * Faire une réservation d'un topo
     *
     */
    List <ResaTopo> setCreate();
}
