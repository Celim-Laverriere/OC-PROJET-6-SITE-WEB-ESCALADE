package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Longueur;
import java.util.List;

public interface LongueurDao {

        /**
         * Renvoie la liste des longueurs demandées
         *
         * @return les {@link Longueur}
         * */
        List <Longueur> longueurs(Integer voie_id);

        /**
         * Ajouter une longueur
         *
         * @param longueur
         * @return un message de confirmation
         */
        String addLongueur(Longueur longueur);

        /**
         * Renvoie la longueur demandée
         *
         * @param id
         * @return la longueur correspondant à son id
         */
        Longueur longueur(Integer id);

        /**
         * Supprimer une longueur
         *
         * @param id
         * @return un message de confirmation
         */
        String delLongueur(Integer id);

        /**
         *Mettre à jour une longeur
         *
         * @param id
         * @return un message de confirmation
         */
        String upLongueur(Integer id, Longueur longueur);
}
