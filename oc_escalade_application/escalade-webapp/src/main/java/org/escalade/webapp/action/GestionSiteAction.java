package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;

import org.escalade.model.bean.Site;
import org.escalade.webapp.AbstractWebappImpl;


import java.util.List;

/**
 *  Action de gestion des {@link Site}
 */
public class GestionSiteAction extends AbstractWebappImpl {

    // =============== Attributs ===============
    private Integer id;

    // ----- Eléments en sortie -----
    private List<Site> sites;
    private Site site;


    // ============ Getters/Setters ============

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Site> getSites() {
        return sites;
    }

    public Site getSite() {
        return site;
    }


    // =============== Méthodes ================

    /**
     * Action listant les {@link Site}
     * @return success
     */
    public String doList() {

        sites = getManagerFactory().getSiteManager().sites();
        return ActionSupport.SUCCESS;
    }

    /**
     * Action affichant les détails d'un {@link Site}
     * @return success / error
     */
    public String doDetail(){

        if(id == null) {
            this.addActionError("Vous devez indiquer un id de site");
        } else {
            try {
                site = getManagerFactory().getSiteManager().site(id);
            } catch (Exception e) {
               this.addActionError("Site non trouvé. ID = " + id);
            }
        }
        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }
}
