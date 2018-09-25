package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Longueur;
import org.escalade.model.bean.Site;

import java.util.List;

public interface SiteDao {

        /**
         * Renvoie le/les site(s) demandée(s)
         *
         * @return Le {@link Site}
         */
        List<Site> getRead();

        /**
         * Créé un site
         *
         */
        List <Site> setCreate();
}
