package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Relai;
import org.escalade.webapp.AbstractWebappImpl;

import java.util.List;

public class GestionRelaiAction extends AbstractWebappImpl {

    // =============== Attributs ===============
    private Integer voie_id;

    // ----- Eléments en sortie -----
    private List<Relai> relais;
    private Relai relai;

    // ============ Getters/Setters ============


    public Integer getVoie_id() {
        return voie_id;
    }

    public void setVoie_id(Integer voie_id) {
        this.voie_id = voie_id;
    }

    public List<Relai> getRelais() {
        return relais;
    }

    public void setRelais(List<Relai> relais) {
        this.relais = relais;
    }


    // =============== Méthodes ================

    /**
     * Action listant les {@link Relai}
     * @return success
     */
    public String doList() {
        relais = getManagerFactory().getRelaiManager().relais(voie_id);
        return ActionSupport.SUCCESS;
    }
}
