package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Longueur;
import org.escalade.model.bean.Relai;

import java.util.List;

public interface RelaiDao {

    /**
     * Renvoie le/les ralai(s) demandée(s)
     *
     * @return Le {@link Relai}
     */
    List<Relai> getRead();

    /**
     * Créé un relai
     *
     */
    List <Relai> setCreate();
}
