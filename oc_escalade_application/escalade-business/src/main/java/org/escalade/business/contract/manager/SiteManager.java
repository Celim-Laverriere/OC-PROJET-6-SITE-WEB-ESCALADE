package org.escalade.business.contract.manager;

import org.escalade.model.bean.Site;

import java.util.List;

public interface SiteManager {

    List<Site> sites();

    String addSite(Site site);

    Site site(Integer id);

    String delSite(Integer id);

    String upSite(Integer id, Site site);
}
