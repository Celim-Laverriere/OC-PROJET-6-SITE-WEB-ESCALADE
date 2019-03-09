package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.Compte;
import java.util.List;

public interface CompteDao {

        /**
         * Renvoie la liste des comptes demandés
         *
         * @return les {@link Compte}
         * */
        List<Compte> comptes();

        /**
         * Ajouter un compte
         *
         * @param compte
         * @return un message de confirmation
         */
        void addCompte(Compte compte);

        /**
         * Renvoie le compte demandé
         *
         * @param compte_id
         * @return le compte correspondant à son id
         */
        Compte compte(Compte compte_id);

        /**
         * Supprimer un compte
         *
         * @param id
         * @return un message de confirmation
         */
        void delCompte(Integer id);

        /**
         * Mettre à jour les informations d'un compte
         *
         * @param compte
         * @return un message de confirmation
         */
        void upCompte(Compte upCompte, Compte compte);

        /**
         *
         * @param login
         * @param password
         * @return
         */
        Compte comptByUtilisateur(String login, String password);

        List<Compte> compteByCommentairesDao(Commentaire commentaire);

        List<Compte> compteByResaTopoDao(Integer compte_id);

        List<Compte> ownerAccountByResaTopoDao(Integer topo_id);

}
