package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Commentaire;
import org.escalade.webapp.AbstractWebappImpl;

import java.util.List;

public class GestionCommentaireAction extends AbstractWebappImpl {

    // =============== Attributs ===============
    private Integer site_id;
    private Integer topo_id;

    // ----- Eléments en sortie -----

    List<Commentaire> commentaires;
    Commentaire commentaire;


    // ============ Getters/Setters ============


    public Integer getSite_id() {
        return site_id;
    }

    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public Integer getTopo_id() {
        return topo_id;
    }

    public void setTopo_id(Integer topo_id) {
        this.topo_id = topo_id;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Commentaire getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(Commentaire commentaire) {
        this.commentaire = commentaire;
    }


    // =============== Méthodes ================

    /**
     * Action listant les commentaire des sites ou des topos {@link Commentaire}
     * @return success
     */
    public String doList(){
        commentaires = getManagerFactory().getCommentaireManager().commentaires(site_id, topo_id);
        return ActionSupport.SUCCESS;
    }
}
