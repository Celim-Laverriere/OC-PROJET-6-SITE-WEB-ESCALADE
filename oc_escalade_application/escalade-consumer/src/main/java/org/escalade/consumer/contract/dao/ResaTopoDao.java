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

        void upResaTopoDao(ResaTopo resaTopo);


        ResaTopo resaTopo(Integer resa_topo_id);

        void delResaTopo(Integer resa_topo_id);

        List<ResaTopo> resaTopoListByTopoAccountDao(Compte compte);

        List<ResaTopo> resaTopoListByAccountDao(Compte compte);

        ResaTopo recoversIdResaTopoDao(ResaTopo resaTopo, Compte compte);
}
