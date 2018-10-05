package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Secteur;
import org.escalade.webapp.AbstractWebappImpl;


import java.util.List;

public class GestionSecteurAction extends AbstractWebappImpl {

    // =============== Attributs ===============
    private Integer siteId;


    // ----- Eléments en sortie -----
    private List<Secteur> secteurs;


    // ============ Getters/Setters ============


    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

// =============== Méthodes ================

    /**
     * Action listant les {@link Secteur}
     */
    public String doList() {
        secteurs = AbstractWebappImpl.getManagerFactory().getSecteurManager().secteurs(siteId);
        return ActionSupport.SUCCESS;
    }
}
