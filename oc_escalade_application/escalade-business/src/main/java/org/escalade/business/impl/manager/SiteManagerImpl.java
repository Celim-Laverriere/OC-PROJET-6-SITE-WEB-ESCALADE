package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.SiteManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.*;

import java.util.List;

public class SiteManagerImpl extends AbstractManagerImpl implements SiteManager {

    @Override
    public List<Site> sites() {
        return getDaoFactory().getSiteDao().sites();
    }

    @Override
    public void addSite(Site site, Compte compte) {
         getDaoFactory().getSiteDao().addSite(site, compte);
    }

    @Override
    public Site site(Integer id){

        Site site = getDaoFactory().getSiteDao().site(id);

        List<Secteur> secteurs = getDaoFactory().getSecteurDao().secteursBySiteId(site.getId());

        List<Commentaire> commentaires = getDaoFactory().getCommentaireDao().commentaires(site.getId(), null);
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
     * La méthode récupère tous les sites correspondant à la région sélectionnée
     * @param regionSelect
     * @return sitesRegionSelect
     */
    public List<Site> rechercheList(Site regionSelect, String typeVoieSelect, String cotationVoieSelect){

        List<Site> sites = getDaoFactory().getSiteDao().sitesBySite(regionSelect, typeVoieSelect, cotationVoieSelect);
//        List<Site> siteSelect = new ArrayList<Site>();
//
//        List<Voie> voies = getDaoFactory().getVoieDao().voieByVoieType(typeVoieSelect, cotationVoieSelect);
//
//     /* Si site_id de la table secteur correspond à id du secteur dans la table voie, alors on
//        sauvegarde le site*/
//
//        for (Voie voie: voies){
//
//           for (Site site: sites){
//               List<Secteur> secteur = getDaoFactory().getSecteurDao().secteursBySiteId(voie.getSecteur_id());
//
//               if(site.getId().equals(secteur.get(0).getSite_id())){
//                   siteSelect.add(site);
//               }
//           }
//        }
//        sites.clear();
//        sites.addAll(siteSelect);

        return sites;
    }
}
