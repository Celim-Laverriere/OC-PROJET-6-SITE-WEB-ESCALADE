package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Commentaire;
import java.util.List;

public interface CommentaireDao {

        /**
         * Renvoie la liste des commentaires demandés
         *
         * @return les {@link Commentaire}
         * */
        List <Commentaire> commentaires();

        /**
         * Ajouter un commentaire
         *
         * @param commentaire
         * @return un message de confirmation
         */
        String addCommentaire(Commentaire commentaire);

        /**
         * Renvoie le commentaire demandé
         *
         * @param id
         * @return le commentaire correspondant à son id
         */
        Commentaire commentaire(Integer id);

        /**
         * Supprimer un commentaire
         *
         * @param id
         * @return un message de confirmation
         */
        String delCommentaire(Integer id);
}
