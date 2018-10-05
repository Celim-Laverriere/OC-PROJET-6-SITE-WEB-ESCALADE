package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.ResaTopo;
import java.util.List;

public interface ResaTopoDao {

        /**
         * Renvoie la liste des réservations de topos
         *
         * @return les {@link ResaTopo}
         * */
        List <ResaTopo> resaTopos();

        /**
         * Ajouter une nouvelle réservation de topo
         *
         * @param resaTopo
         * @return un message de confirmation
         */
        String addResaTopo(ResaTopo resaTopo);

        /**
         * Renvoie la réservation du topo demandé
         *
         * @param id
         * @return la réservation du topo correspondant à son id
         */
        ResaTopo resaTopo(Integer id);

        /**
         * Supprimer une réservation de topo
         *
         * @param id
         * @return un message de confirmation
         */
        String delResaTopo(Integer id);
}
