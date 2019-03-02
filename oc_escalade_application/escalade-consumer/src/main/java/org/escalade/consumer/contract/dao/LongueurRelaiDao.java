package org.escalade.consumer.contract.dao;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.LongueurRelai;
import org.escalade.model.bean.Voie;

import java.util.List;

public interface LongueurRelaiDao {

        /**
         * Renvoie la liste des longueurs et des relais demandées d'une voie
         *
         * @return les {@link LongueurRelai}
         * */
        List <LongueurRelai> longueursRelai(Integer voie_id);

        /**
         * Ajouter une longueur et un relai d'une voie
         *
         * @param longueurRelai
         * @return un message de confirmation
         */
        void addLongueurRelai(LongueurRelai longueurRelai, Voie voie);

        /**
         * Renvoie la longueur demandée et les relais de la voie
         *
         * @param id
         * @return la longueur correspondant à son id
         */
        LongueurRelai longueurRelai(Integer id);

        void delLongueurRelai(Integer id);

        void upLongueur(LongueurRelai longueur);

        List<LongueurRelai> listLongueursByVoieDao(Voie voie);

//        List<LongueurRelai> recoversLongueurWorkflowDao(LongueurRelai longueurRelai, Voie voie);
}
