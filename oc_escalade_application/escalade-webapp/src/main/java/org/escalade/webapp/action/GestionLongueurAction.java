package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Longueur;
import org.escalade.webapp.AbstractWebappImpl;

import java.util.List;

public class GestionLongueurAction extends AbstractWebappImpl {

    // =============== Attributs ===============
    private Integer voie_id;

    // ----- Eléments en sortie -----
    private List<Longueur> longueurs;
    private Longueur longueur;


    // ============ Getters/Setters ============


    public Integer getVoie_id() {
        return voie_id;
    }

    public void setVoie_id(Integer voie_id) {
        this.voie_id = voie_id;
    }

    public List<Longueur> getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(List<Longueur> longueurs) {
        this.longueurs = longueurs;
    }

    public Longueur getLongueur() {
        return longueur;
    }

    public void setLongueur(Longueur longueur) {
        this.longueur = longueur;
    }


    // =============== Méthodes ================

    /**
     * Action listant les {@link Longueur}
     * @return success
     */
    public String doList(){
        longueurs = getManagerFactory().getLongueurManager().longueurs(voie_id);
        return ActionSupport.SUCCESS;
    }
}
