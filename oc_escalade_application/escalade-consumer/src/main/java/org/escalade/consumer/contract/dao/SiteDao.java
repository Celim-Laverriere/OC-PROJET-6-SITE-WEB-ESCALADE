package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Site;

import javax.swing.*;
import java.util.List;

public interface SiteDao {

        /**
         * Renvoie la liste des sites demandés
         *
         * @return les {@link Site}
         */
        List<Site> sites();

        /**
         * Ajouter un site
         *
         * @param site
         * @return un message de confirmation
         */
        void addSite(Site site, Compte compte);

        /**
         * Renvoie le site demandé
         *
         * @param id
         * @return le site correspondant à son id
         */
        Site site(Integer id);

        /**
         * Supprimer un site
         *
         * @param id
         * @return un message de confirmation
         */
        String delSite(Integer id);

        /**
         * Mettre à jour un site
         *
         * @param id
         * @param site
         * @return un message de confirmation
         */
        String upSite(Integer id, Site site);

        /**
         * Renvoie la liste des sites correspondant à la région sélectionnée.
         *
         * @return
         */
        List<Site> sitesBySite(Site regionSelect, String typeVoieSelect, String cotationVoieSelect);

}
