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
                List<LongueurRelai> longueursRelai = getDaoFactory().getLongueurRelaiDao().longueursRelai(voie.getId());
                voie.setLongueursRelais(longueursRelai);
            }
            secteur.setVoies(voies);
        }
        site.setSecteurs(secteurs);
        return site;
    }

    @Override
    public void delSite(Integer id) {
        getDaoFactory().getSiteDao().delSite(id);
    }


    @Override
    public void upSite(Site site) {
        getDaoFactory().getSiteDao().upSite(site);
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
     * @param motCleRecherche
     * @return sites
     */
    @Override
    public List<Site> rechercheSimpleParSite(String motCleRecherche) {

        List<Site> sites = getDaoFactory().getSiteDao().rechercheSimpleParSiteDao(motCleRecherche);
        return sites;
    }

    /**
     * Renvoie le site correspondant aux secteurs trouver lors de la recherche,
     * dans la " barre de recherche" du navigateur.
     * @param secteurs
     * @return sites
     */
    public List<Site> rechercheSiteParSecteur(List<Secteur> secteurs) {

        List<Site> sites = new ArrayList<>();
        Set<Integer> secteurSite_id = new HashSet<>();

        for (Secteur secteur: secteurs){
            secteurSite_id.add(secteur.getSite_id());
        }

        for (Integer site_id : secteurSite_id){
            List<Site> siteParSecteur = getDaoFactory().getSiteDao().rechercheSiteParSecteur(site_id);
            sites.addAll(siteParSecteur);
        }

        return sites;
    }

    @Override
    public List<Site> sitesParSessionDeCompte(Compte compte) {

        return getDaoFactory().getSiteDao().sitesParSessionDeCompteDao(compte);
    }
}
