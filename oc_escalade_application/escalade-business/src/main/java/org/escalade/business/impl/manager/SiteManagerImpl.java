package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.SiteManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.*;

import javax.swing.plaf.synth.Region;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SiteManagerImpl extends AbstractManagerImpl implements SiteManager {

    @Override
    public List<Site> sites() {
        return getDaoFactory().getSiteDao().sites();
    }

    @Override
    public String addSite(Site site) {
        return getDaoFactory().getSiteDao().addSite(site);
    }

    @Override
    public Site site(Integer id){
        Site site = getDaoFactory().getSiteDao().site(id);

        List<Secteur> secteurs = getDaoFactory().getSecteurDao().secteurs(site.getId());

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

    public List<String> regions(){

        List<Site> sites = getDaoFactory().getSiteDao().sites();
        List<String> regionsList = new ArrayList<String>();

        for (Site site: sites){
            if (!regionsList.contains(site.getRegion())){
                regionsList.add(site.getRegion());
            }
        }
        return regionsList;
    }

    /**
     * La méthode récupère tous les sites correspondant à la région sélectionnée
     * @param regionSelect
     * @return sitesRegionSelect
     */
    public List<Site> rechercheList(String regionSelect){

        List<Site> sites = getDaoFactory().getSiteDao().sites();
        List<Site> sitesRegionSelect = new ArrayList<Site>();

        for (Site site: sites){
            if (regionSelect.equals(site.getRegion())){
               sitesRegionSelect.add(site);
            }
        }
        return sitesRegionSelect;
    }
}
