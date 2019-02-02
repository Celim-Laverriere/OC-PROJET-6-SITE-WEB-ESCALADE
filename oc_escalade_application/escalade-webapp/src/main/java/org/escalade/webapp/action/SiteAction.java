package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
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
    private List<String> regionListSite = new ArrayList<>();

    // ----- Eléments en entrée -----
    private List<Site> sites;
    private Site site;
    private Site modifSite;
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

//    ===================================

    public Site getModifSite() {
        return modifSite;
    }

    public void setModifSite(Site modifSite) {
        this.modifSite = modifSite;
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

    public String sitesParSessionDeCompte (){
        String vResult = ActionSupport.INPUT;

        try {
            sites = managerFactory.getSiteManager().sitesParSessionDeCompte((Compte) this.session.get("user"));
            vResult = ActionSupport.SUCCESS;

            if (sites.isEmpty()) {
            vResult = ActionSupport.INPUT;
            this.addActionMessage("Vous n'avez pas encore de sites d'escalades !");
            }

        } catch (NullPointerException pEX) {

        } catch (Exception pEX) {
            this.addActionError("Une erreur technique s'est produite, votre site n'a pas pu être ajouté !");
        }

        return vResult;
    }

    /**
     * Action pour modifier un site par un client
     * @return success
     */
    public String modifierSite() {

        String vResult = ActionSupport.INPUT;

            try {

                managerFactory.getSiteManager().upSite(modifSite);
                vResult = ActionSupport.SUCCESS;

                this.addActionMessage("Modifications effectuées !");

            } catch (NullPointerException pEX) {
                site = managerFactory.getSiteManager().site(site_id);
                regionList = managerFactory.getSiteManager().siteByRegion();

                for(Site regionList : regionList){
                    regionListSite.add(regionList.getRegion());
                }


            } catch (Exception pEX){
                this.addActionError("Une erreur technique s'est produite, veuillez réessayer plus tard!");
            }


        return vResult;
    }

    public String supprimerSite(){
        String vResult = ActionSupport.INPUT;

        try {
            managerFactory.getSiteManager().delSite(site_id);
            vResult = ActionSupport.SUCCESS;
        } catch (Exception pEX) {

        }

        return vResult;
    }

    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
}
