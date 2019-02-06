package org.escalade.consumer.contract.dao;

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
        String addTopo(Topo topo);

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
        String delTopo(Integer id);

        /**
         * Mettre à jour un topo
         *
         * @param id
         * @return un message de confirmation
         */
        String upTopo(Integer id, Topo topo);
}
