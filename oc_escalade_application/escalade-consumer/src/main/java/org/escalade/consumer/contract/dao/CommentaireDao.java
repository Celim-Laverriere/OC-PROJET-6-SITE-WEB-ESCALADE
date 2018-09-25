package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Commentaire;
import java.util.List;

public interface CommentaireDao {

    /**
     * Renvoie le/les commentaires demandé
     *
     * @return Le {@link Commentaire}
     */
    List <Commentaire> getRead();

    /**
     * Créé un commentaires
     *
     */
    List <Commentaire> setCreate();

}
