package org.escalade.consumer.contract.dao;

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
        String addCompte(Compte compte);

        /**
         * Renvoie le compte demandé
         *
         * @param id
         * @return le compte correspondant à son id
         */
        Compte compte(Integer id);

        /**
         * Supprimer un compte
         *
         * @param id
         * @return un message de confirmation
         */
        String delCompte(Integer id);

        /**
         * Mettre à jour les informations d'un compte
         *
         * @param id
         * @return un message de confirmation
         */
        String upCompte(Integer id, Compte compte);

}
