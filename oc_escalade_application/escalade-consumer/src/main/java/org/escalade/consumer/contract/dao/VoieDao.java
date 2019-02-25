package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Voie;

import javax.swing.*;
import java.util.HashMap;
import java.util.List;

public interface VoieDao {

       /**
        * Renvoie la liste des voies demandées
        *
        * @return les {@link Voie}
        */
       List<Voie> voies(Integer secteur_id);

       /**
        * Ajouter une voie
        *
        * @param voie
        * @return un message de confirmation
        */
       void addVoie(Voie voie, Secteur secteur);

       /**
        * Renvoie la voie demandée
        *
        * @param id
        * @return la voie correspondant à son id
        */
       Voie voie(Integer id);

    /**
     * Supprimer une voie
     *
     * @param id
     * @return un message de confirmation
     */
       String delVoie(Integer id);

    /**
     * Mettre à jour une voie
     *
     * @param voie
     * @return un message de confirmation
     */
       String upVoie(Voie voie);

    /**
     * Recherche dans la table "voie" une correspondance
     * par le nom de la voie avec la saissi de l'utilisateur.
     * @param motCleRecherche
     * @return
     */
    List<Voie>  rechercheSimpleParVoieDao(String motCleRecherche);

    Voie recoversVoieWorkflowDao(Voie voie, Secteur secteur);
}
