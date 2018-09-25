package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Longueur;
import org.escalade.model.bean.Secteur;

import java.util.List;

public interface SecteurDao {

    /**
     * Renvoie le/les secteur(s) demandée(s)
     *
     * @return Le {@link Secteur}
     */
    List<Secteur> getRead();

    /**
     * Créé un secteur
     *
     */
    List <Secteur> setCreate();
}
