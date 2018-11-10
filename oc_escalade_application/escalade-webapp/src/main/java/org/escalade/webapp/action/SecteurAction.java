package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;
import org.escalade.webapp.AbstractWebappImpl;

public class SecteurAction extends AbstractWebappImpl {

    // ----- Eléments en entrée et en sortie -----
    private Site site;
    private Secteur secteur;

    // ============ Getters/Setters ============


    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    // =============== Méthodes ================

    public String doCreate(){

        //Methode peuplant la liste des régions dans le formulaire de recherche
        fillRegion();

        getManagerFactory().getSecteurManager().addSecteur(secteur, site);

        this.addActionMessage("Secteur " + secteur.getNom() + " a été ajouté avec succè");

       return ActionSupport.SUCCESS;
    }
}
