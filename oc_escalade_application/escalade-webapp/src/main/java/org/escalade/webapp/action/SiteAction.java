package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Site;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *  Action de gestion des {@link Site}
 */
public class SiteAction extends ActionSupport implements SessionAware {

    // =============== Attributs ===============
    private Integer site_id;

    // ----- Eléments en sortie -----
    private List<Site> regionList = new ArrayList<>();

    // ----- Eléments en entrée -----
    private List<Site> sites;
    private Site site;
    private Compte compte;

    // ----- Eléments Struts
    private Map<String, Object> session;

    @Inject
    private ManagerFactory managerFactory;

    // ============ Getters/Setters ============

    public List<Site> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Site> regionList) {
        this.regionList = regionList;
    }

    public Integer getSite_id() {
        return site_id;
    }

    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    // =============== Méthodes ================

    /**
     * Action listant les {@link Site}
     * @return success
     */
    public String doList() {
        sites = managerFactory.getSiteManager().sites();
        return ActionSupport.SUCCESS;
    }

    /**
     * Action affichant les détails d'un {@link Site}
     * @return success / error
     */
    public String doDetail(){

        if(site_id == null) {
            this.addActionError("Vous devez indiquer un id de site");
        } else {
            try {
                site = managerFactory.getSiteManager().site(site_id);
            } catch (Exception e) {
               this.addActionError("Site non trouvé. ID = " + site_id + " " + e);
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }

    /**
     * Action de création d'un nouveau site
     * @return success / error
     */
    public String doCreate(){

        String vResult = ActionSupport.INPUT;

            try {
                managerFactory.getSiteManager().addSite(site, (Compte) this.session.get("user"));
                vResult =  ActionSupport.SUCCESS;

                this.addActionMessage("Projet "+ site.getNom() + " a été ajouté avec succè");

            } catch (NullPointerException pEX){
                regionList = managerFactory.getSiteManager().siteByRegion();
            } catch (Exception pEX) {
                this.addActionError("Une erreur technique s'est produite, votre site n'a pas pu être ajouté !");
                regionList = managerFactory.getSiteManager().siteByRegion();
            }

        return vResult;
    }

    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
}
