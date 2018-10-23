package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Site;
import org.escalade.webapp.AbstractWebappImpl;
import java.util.List;


public class GestionMoteurDeRechercheAction extends AbstractWebappImpl {

    // ============ Eléments en entrée  ============
    private String regionSelect;

    // ============ Eléments en sortie ============
    private List<Site> sites;

    // ============ Getters/Setters ============

    public String getRegionSelect() {
        return regionSelect;
    }

    public void setRegionSelect(String regionSelect) {
        this.regionSelect = regionSelect;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    // =============== Méthodes ================

    /**
     * Action qui retourne la liste des sites correspondant à la région sélectionnée
     * @return success
     */
    public String doRecherche(){
        sites = getManagerFactory().getSiteManager().rechercheList(regionSelect);

        //Methode peuplant la liste des régions dans le formulaire de recherche
        getRegion();

        return ActionSupport.SUCCESS;

    }
}
