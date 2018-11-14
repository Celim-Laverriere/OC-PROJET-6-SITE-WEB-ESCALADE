package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Voie;

import javax.inject.Inject;
import java.util.List;

public class VoieAction extends ActionSupport {

    // =============== Attributs ===============
    private Integer secteur_id;
    private Integer voie_id;

    // ----- Eléments en sortie -----
    private List<Voie> voies;
    private Voie voie;

    @Inject
    private ManagerFactory managerFactory;

    // ============ Getters/Setters ============


    public Integer getSecteur_id() {
        return secteur_id;
    }

    public void setSecteur_id(Integer secteur_id) {
        this.secteur_id = secteur_id;
    }

    public Integer getVoie_id() {
        return voie_id;
    }

    public void setVoie_id(Integer voie_id) {
        this.voie_id = voie_id;
    }

    public List<Voie> getVoies() {
        return voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    // =============== Méthodes ================

    /**
     * Action listant les {@link Voie}
     * @return success
     */
    public String doList() {
        voies = managerFactory.getVoieManager().voies(secteur_id);
        return ActionSupport.SUCCESS;
    }


    public String doDetail(){

        if (voie_id == null) {
            this.addActionError("Vous devez indiquer un id de voie");
        } else {
            try{
                voie = managerFactory.getVoieManager().voie(voie_id);
            } catch (Exception e){
                System.out.println(e);
                this.addActionError("Voie non trouvé. ID = " + voie_id);
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }
}
