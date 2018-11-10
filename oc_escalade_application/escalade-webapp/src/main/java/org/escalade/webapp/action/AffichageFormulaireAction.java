package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Site;
import org.escalade.webapp.AbstractWebappImpl;

import java.util.List;

public class AffichageFormulaireAction extends AbstractWebappImpl{

    // ============ Eléments en entrée  ============
    private List<Compte> comptes;
    private List<Site> sites ;
    // ============ Eléments en sortie ============


    // ============ Getters/Setters ============

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    // =============== Méthodes ================

    /**
     * Action qui affiche le menu de création pour les ( Sites, Secteur, Voies...)
     * @return success
     */
    public String doAffichageChoixCreate (){
        fillRegion();
        return ActionSupport.SUCCESS;
    }

    /**
     * Action qui affiche le formulaire de création d'un site et retourne la liste des comptes utilisateur
     * @return success
     */
    public String doAfficheFormmulaireSite(){
        fillRegion();
        comptes = getManagerFactory().getCompteManager().comptes();
        return ActionSupport.SUCCESS;
    }

    public String doAfficheFormulaireSecteur(){
        fillRegion();
        sites = getManagerFactory().getSiteManager().sites();
        return ActionSupport.SUCCESS;
    }
}
