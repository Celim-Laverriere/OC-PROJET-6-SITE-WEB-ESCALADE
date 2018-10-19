package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Secteur;
import org.escalade.webapp.AbstractWebappImpl;

import java.util.List;

/**
 *  Action de gestion des {@link Secteur}
 */
public class GestionSecteurAction extends AbstractWebappImpl {

    // =============== Attributs ===============
    private Integer site_id;


    // ----- Eléments en sortie -----
    private List<Secteur> secteurs;


    // ============ Getters/Setters ============

    public Integer getSite_id() {
        return site_id;
    }

    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }


// =============== Méthodes ================

    /**
     * Action listant les {@link Secteur}
     * @return success
     */
    public String doList() {
        secteurs = getManagerFactory().getSecteurManager().secteurs(site_id);
        return ActionSupport.SUCCESS;
    }
}
