package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Secteur;
import java.util.List;

public interface SecteurDao {

        /**
         * Renvoie la liste des secteurs demandés
         *
         * @return les {@link Secteur}
         * */
        List <Secteur> secteurs(Integer siteId);

        /**
         * Ajouter un secteur
         *
         * @param secteur
         * @return un message de confirmation
         */
        String addSecteur(Secteur secteur);

        /**
         * Renvoie le secteur demandé
         *
         * @param id
         * @return le secteur correspondant à son id
         */
        Secteur secteur(Integer id);

        /**
         * Supprimer un secteur
         *
         * @param id
         * @return un message de confirmation
         */
        String delSecteur(Integer id);

        /**
         * Mettre à jour un secteur
         *
         * @param id
         * @return un message de confirmation
         */
        String upSecteur(Integer id, Secteur secteur);
}
