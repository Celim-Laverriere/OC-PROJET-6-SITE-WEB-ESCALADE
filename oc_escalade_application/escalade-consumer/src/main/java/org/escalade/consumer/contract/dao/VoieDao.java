package org.escalade.consumer.contract.dao;

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
       String addVoie(Voie voie);

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
     *
     * @param motCleRecherche
     * @return
     */
       Voie voieByMotCleRecherche(String motCleRecherche);

}
