package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.SiteManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.*;

import java.util.*;


public class SiteManagerImpl extends AbstractManagerImpl implements SiteManager {

    @Override
    public List<Site> sites() {
        return getDaoFactory().getSiteDao().sites();
    }

    @Override
    public void addSite(Site site, Compte compte) {
         getDaoFactory().getSiteDao().addSite(site, compte);
    }

    /**
     * Renvoie le detail du site d'escalade sélectionné (Secteurs, Voies, Relais, Longueurs).
     * @param site_id
     * @return site
     */
    @Override
    public Site site(Integer site_id){

        Site site = getDaoFactory().getSiteDao().site(site_id);

        List<Secteur> secteurs = getDaoFactory().getSecteurDao().secteursBySiteId(site_id);

        List<Commentaire> commentaires = getDaoFactory().getCommentaireDao().commentaires(site_id, null);
        site.setCommentaires(commentaires);

        for(Secteur secteur: secteurs){

            List<Voie> voies = getDaoFactory().getVoieDao().voies(secteur.getId());

            for(Voie voie: voies){
                List<Relai> relais = getDaoFactory().getRelaiDao().relais(voie.getId());
                voie.setRelais(relais);
                List<Longueur> longueurs = getDaoFactory().getLongueurDao().longueurs(voie.getId());
                voie.setLongueurs(longueurs);
            }
            secteur.setVoies(voies);
        }
        site.setSecteurs(secteurs);
        return site;
    }

    @Override
    public String delSite(Integer id) {
        return getDaoFactory().getSiteDao().delSite(id);
    }

    @Override
    public String upSite(Integer id, Site site) {
        return getDaoFactory().getSiteDao().upSite(id, site);
    }

    /**
     * La méthode récupère tous les sites correspondant à la région, le type de voie
     * (équipée ou non) et sa difficulté.
     * @param regionSelect
     * @return sitesRegionSelect
     */
    public List<Site> sitesByAdvancedSearch(String regionSelect, String typeVoieSelect, String cotationVoieSelect){

        List<Site> sites = getDaoFactory().getSiteDao().sitesByAdvancedSearchDao(regionSelect, typeVoieSelect, cotationVoieSelect);

        return sites;
    }

    /**
     * La méthode récupère toutes les régions de la table public.site.
     * @return
     */
    public List<Site> siteByRegion(){

        List<Site> listRegion =  getDaoFactory().getSiteDao().siteByRegionDao();

        return listRegion;
    }

    /**
     * Recherche dans la table site une correcpondance avec le mot clé de recherche
     * saisi pas l'utilisateur.
     * @return
     */
    @Override
    public Site siteBySimpleSearch(String motCleRecherche) {

        Site site = getDaoFactory().getSiteDao().siteBySimpleSearchDao(motCleRecherche);

        return site;
    }

    @Override
    public List<Site> sitesParSessionDeCompte(Compte compte) {

        return getDaoFactory().getSiteDao().sitesParSessionDeCompteDao(compte);
    }
}
