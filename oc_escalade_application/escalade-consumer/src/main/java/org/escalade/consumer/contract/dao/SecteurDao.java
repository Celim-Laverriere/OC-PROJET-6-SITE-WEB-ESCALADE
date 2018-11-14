package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;

import java.util.List;

public interface SecteurDao {

        /**
         * Renvoie la liste des secteurs demandés
         *
         * @return les {@link Secteur}
         * */
        List <Secteur> secteurs();

        /**
         * Ajouter un secteur
         *
         * @param secteur
         * @return un message de confirmation
         */
        void addSecteur(Secteur secteur, Integer site_id);

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

        /**
         *Renvoie les secteurs correspondant au site sélectionné
         * @param site_id
         * @return les Secteurs
         */
        List<Secteur> secteursBySiteId(Integer site_id);

        Secteur secteurByMotCleRecherche(String motCleRecherche);
}
