package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Topo;

import java.util.List;

public interface CommentaireDao {

        List <Commentaire> commentaires(Integer site_id, Integer topo_id);

        void addCommentaireSiteDao(Commentaire commentaire, Compte compte);

        void addCommentaireTopoDao(Commentaire commentaire, Compte compte);

        /**
         * Renvoie le commentaire demandé
         *
         * @param site_id, topo_id
         * @return le commentaire correspondant à son id
         */
        Commentaire commentaire(Integer site_id, Integer topo_id);

        /**
         * Supprimer un commentaire
         *
         * @param id
         * @return un message de confirmation
         */
        String delCommentaire(Integer id);

        List<Commentaire> commentairesByTopoDao(Topo topo);
}
