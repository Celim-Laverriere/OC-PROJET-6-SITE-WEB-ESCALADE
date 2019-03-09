package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.ResaTopo;
import org.escalade.model.bean.Topo;

import java.util.List;

public interface TopoDao {

        /**
         * Renvoie la liste des topos demandés
         *
         * @return les {@link Topo}
         */
        List<Topo> topos();

        /**
         * Ajouter un Topo
         *
         * @param topo
         * @return un message de confirmation
         */
        void addTopo(Topo topo, Compte compte);

        /**
         * Renvoie le topo demandé
         *
         * @param id
         * @return le topo correspondant à son id
         */
        Topo topo(Integer id);

        /**
         * Supprimer un topo
         *
         * @param id
         * @return un message de confirmation
         */
        void delTopo(Integer id);


        void upTopo(Topo topo);

        Topo recoversTopoForIdDao(Compte compte, Topo topo);

        List<Topo> topoByAccountDao(Compte compte);

        List<Topo> toposByResaTopoDao(ResaTopo resaTopo);
}
