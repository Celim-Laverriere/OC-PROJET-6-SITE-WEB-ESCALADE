package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Topo;
import org.escalade.model.bean.Voie;

import java.util.List;

public interface VoieDao {

    /**
     * Renvoie le/les topo(s) demandée(s)
     *
     * @return Le {@link Voie}
     */
    List<Voie> getRead();

    /**
     * Créé un topo
     *
     */
    List <Voie> setCreate();
}
