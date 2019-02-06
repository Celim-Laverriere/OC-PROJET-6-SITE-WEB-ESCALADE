package org.escalade.consumer.contract.dao;
import org.escalade.model.bean.LongueurRelai;
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
        String addLongueurRelai(LongueurRelai longueurRelai);

        /**
         * Renvoie la longueur demandée et les relais de la voie
         *
         * @param id
         * @return la longueur correspondant à son id
         */
        LongueurRelai longueurRelai(Integer id);

        /**
         * Supprimer une longueur et le relai d'une voie
         *
         * @param id
         * @return un message de confirmation
         */
        String delLongueurRelai(Integer id);

        /**
         *Mettre à jour une longueur et un relai d'une voie
         *
         * @param id
         * @return un message de confirmation
         */
        String upLongueurRelai(Integer id, LongueurRelai longueur);
}
