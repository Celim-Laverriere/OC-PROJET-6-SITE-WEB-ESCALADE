package org.escalade.consumer.contract.dao;


import org.escalade.model.bean.Relai;
import java.util.List;

public interface RelaiDao {

        /**
         * Renvoie la liste des relais demandés
         *
         * @return les {@link Relai}
         * */
        List <Relai> relais();

        /**
         * Ajouter un relai
         *
         * @param relai
         * @return un message de confirmation
         */
        String addRelai(Relai relai);

        /**
         * Renvoie le relai demandé
         *
         * @param id
         * @return le relai correspondant à son id
         */
        Relai relai(Integer id);

        /**
         * Supprimer un relai
         *
         * @param id
         * @return un message de confirmation
         */
        String delRelai(Integer id);

        /**
         *Mettre à jour un relai
         *
         * @param id
         * @return un message de confirmation
         */
        String upRelai(Integer id, Relai relai);

}
