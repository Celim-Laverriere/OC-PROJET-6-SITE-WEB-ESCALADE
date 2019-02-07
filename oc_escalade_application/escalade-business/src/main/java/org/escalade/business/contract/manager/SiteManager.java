package org.escalade.business.contract.manager;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Voie;

import java.util.ArrayList;
import java.util.List;

public interface SiteManager {

    List<Site> sites();

    void addSite(Site site, Compte compte);

    Site site(Integer site_id);

    void delSite(Integer id);

    void upSite(Site site);

    List<Site> sitesByAdvancedSearch(String regionSelect, String typeVoieSelect, String cotationVoieSelect);

    List<Site> siteByRegion();

    List<Site> rechercheSimpleParSite(String motCleRecherche);

    List<Site> rechercheSiteParSecteur(List<Secteur> secteurs);

    List<Site> sitesParSessionDeCompte(Compte compte);

}
