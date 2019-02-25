package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Site;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *  Action de gestion des {@link Site}
 */
public class SiteAction extends ActionSupport implements SessionAware {

    // =============== Attributs ===============
    private Integer site_id;

    // ----- Eléments en sortie -----

    private List<String> regions = new ArrayList(Arrays.asList("Ile-de-France", "Champagne-Ardenne", "Picardie",
            "Haute-Normandie", "Centre", "Basse-Normandie", "Bourgogne", "Nord-Pas-de-Calais", "Lorraine", "Alsace",
            "Franche-Comté", "Pays de la Loire", "Bretagne", "Poitou-Charentes", "Aquitaine", "Midi-Pyrénées",
            "Limousin", "Rhône-Alpes", "Auvergne", "Languedoc-Roussillon", "Provence-Alpes-Côte d'Azur",
            "Corse", "Guadeloupe", "Martinique", "Guyane", "La Réunion", "Mayotte"));

    // ----- Eléments en entrée -----
    private List<Site> sites;
    private Site site;
    private Site modifySite;
    private Compte compte;

    // ----- Eléments Struts
    private Map<String, Object> session;

    @Inject
    private ManagerFactory managerFactory;

    // ============ Getters/Setters ============

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
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

    public Site getModifySite() {
        return modifySite;
    }

    public void setModifySite(Site modifySite) {
        this.modifySite = modifySite;
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

            } catch (Exception pEX) {
                this.addActionError("Une erreur technique s'est produite, votre site n'a pas pu être ajouté !");

            }

        return vResult;
    }

    public String actionListSitesByAccount(){
        String vResult = ActionSupport.INPUT;

        try {
            sites = managerFactory.getSiteManager().listSitesByAccount((Compte) this.session.get("user"));
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
    public String modifiedSite() {

        String vResult = ActionSupport.INPUT;

            try {

                site = (Site) this.session.get("site");
                modifySite.setId(site.getId());

                /**
                 * @see org.escalade.business.impl.manager.SiteManagerImpl#upSite(Site)
                 */
                managerFactory.getSiteManager().upSite(modifySite);
                vResult = ActionSupport.SUCCESS;

                this.addActionMessage("Modifications effectuées !");

            } catch (NullPointerException pEX) {
                /**
                 * @see org.escalade.business.impl.manager.SiteManagerImpl#site(Integer)
                 */
                site = managerFactory.getSiteManager().site(site_id);
                this.session.put("site", site);

            } catch (Exception pEX){
                this.addActionError("Une erreur technique s'est produite, veuillez réessayer plus tard!");
            }

        return vResult;
    }

    /**
     * Cette méthode permet de supprimer un site
     * @return
     */
    public String supprimerSite(){
        String vResult = ActionSupport.INPUT;

        try {
            /**@see org.escalade.business.impl.manager.SiteManagerImpl#delSite(Integer)*/
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
