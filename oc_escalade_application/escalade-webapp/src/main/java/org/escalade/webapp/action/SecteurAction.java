package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;


import javax.inject.Inject;
import java.util.List;
import java.util.Map;

public class SecteurAction extends ActionSupport implements SessionAware {

    // ======================== Attributs =======================
    // ----- Eléments en entrée -----
    private Integer site_id;
    private Secteur secteur;
    private Compte compte;

    // ----- Eléments en sortie -----
    private List<Site> sites;
    private List<Secteur> secteurs;

    // ----- Eléments Struts
    private Map<String, Object> session;

    @Inject
    private ManagerFactory managerFactory;

    // ============ Getters/Setters ============


    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Integer getSite_id() {
        return site_id;
    }

    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    // =============== Méthodes ================

    public String doCreate(){

        String vResult = ActionSupport.INPUT;

        try{
            managerFactory.getSecteurManager().addSecteur(secteur, site_id);
            vResult = ActionSupport.SUCCESS;

            this.addActionMessage("Secteur " + secteur.getNom() + " a été ajouté avec succè");

        } catch (NullPointerException pEX){
            sites = managerFactory.getSiteManager().sitesParSessionDeCompte((Compte) this.session.get("user"));
        } catch (Exception pEX){
            this.addActionError("Une erreur technique s'est produite, votre secteur n'a pas pu être ajouté !");
            sites = managerFactory.getSiteManager().sitesParSessionDeCompte((Compte) this.session.get("user"));
        }

       return vResult;
    }

    public String secteursParSessionDeCompte() {
        String vResult = ActionSupport.INPUT;

        try {
          secteurs =  managerFactory.getSecteurManager().secteursParSessionDeCompte((Compte) this.session.get("user"));
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
