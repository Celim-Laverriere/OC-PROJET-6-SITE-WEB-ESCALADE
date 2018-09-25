package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.Longueur;
import java.util.List;

public interface LongueurDao {

    /**
     * Renvoie le/les longueure(s) demandée(s)
     *
     * @return Le {@link Longueur}
     */
    List<Longueur> getRead();

    /**
     * Créé une longueur
     *
     */
    List <Longueur> setCreate();

}
