package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Compte;
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

        /**
         ** Recherche dans la table "secteur" une correspondance
         *  dans la colonne "nom" avec la saissi de l'utilisateur.
         * @param motCleRecherche
         * @return
         */
        List<Secteur> secteurBySimpleSearchDao(String motCleRecherche);

        /**
         * Renvoie le secteur correspondant a secteur_id de la voie trouver
         * lors de la recherche.
         * @param secteur_id
         * @return sites
         */
        List<Secteur> rechercheSecteurParVoie(Integer secteur_id);

        /**
         * Renvoie les secteurs correspondant à la session en cours
         * @param compte
         * @return
         */
       List<Secteur> secteursParSessionDeCompteDao(Compte compte);

        Secteur recoversSecteurWorkflowDao(Secteur secteur, Site site);
}
