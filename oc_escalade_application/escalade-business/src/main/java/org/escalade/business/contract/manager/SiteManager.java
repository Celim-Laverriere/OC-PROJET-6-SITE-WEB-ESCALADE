package org.escalade.business.contract.manager;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Site;

import java.util.ArrayList;
import java.util.List;

public interface SiteManager {

    List<Site> sites();

    void addSite(Site site, Compte compte);

    Site site(Integer site_id);

    String delSite(Integer id);

    String upSite(Integer id, Site site);

    List<Site> sitesByAdvancedSearch(String regionSelect, String typeVoieSelect, String cotationVoieSelect);

    List<Site> siteByRegion();

    Site siteBySimpleSearch(String motCleRecherche);

    List<Site> sitesByCompteSession (Compte compte);

}
