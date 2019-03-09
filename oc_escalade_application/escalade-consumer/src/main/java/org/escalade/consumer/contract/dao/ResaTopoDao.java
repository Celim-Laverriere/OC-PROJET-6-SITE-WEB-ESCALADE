package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.ResaTopo;
import java.util.List;

public interface ResaTopoDao {

        /**
         * Renvoie la liste des réservations de topos
         *
         * @return les {@link ResaTopo}
         * */
        List <ResaTopo> resaTopos(Integer compte_id, Integer topo_id);


        void addResaTopo(ResaTopo resaTopo, Compte compte);

        /**
         * Renvoie la réservation du topo demandé
         *
         * @param compte_id, topo_id
         * @return la réservation du topo correspondant à son id
         */
        ResaTopo resaTopo(Integer compte_id, Integer topo_id);

        /**
         * Supprimer une réservation de topo
         *
         * @param id
         * @return un message de confirmation
         */
        String delResaTopo(Integer id);

        List<ResaTopo> resaTopoListByTopoAccountDao(Compte compte);

        List<ResaTopo> resaTopoListByAccountDao(Compte compte);

        ResaTopo recoversIdResaTopoDao(ResaTopo resaTopo, Compte compte);
}
