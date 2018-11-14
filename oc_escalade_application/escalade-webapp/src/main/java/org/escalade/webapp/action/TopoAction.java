package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Topo;


import javax.inject.Inject;
import java.util.List;

public class TopoAction extends ActionSupport {

    // =============== Attributs ===============
    private Integer topo_id;

    // ----- Eléments en sortie -----
    private List<Topo> topos;
    private Topo topo;

    @Inject
    private ManagerFactory managerFactory;

    // ============ Getters/Setters ============


    public Integer getTopo_id() {
        return topo_id;
    }

    public void setTopo_id(Integer topo_id) {
        this.topo_id = topo_id;
    }

    public List<Topo> getTopos() {
        return topos;
    }

    public void setTopos(List<Topo> topos) {
        this.topos = topos;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }


    // =============== Méthodes ================

    /**
     * Action listant les {@link Topo}
     * @return success
     */
    public String doList(){
        topos = managerFactory.getTopoManager().topos();
        return ActionSupport.SUCCESS;
    }

    /**
     * Action affichant les détails d'un {@Topo}
     * @return success / error
     */
    public String doDetail(){

        if (topo_id == null) {
            this.addActionError("Vous devez indiquer un id de topo");
        } else {
            try {
                topo = managerFactory.getTopoManager().topo(topo_id);
            } catch (Exception e) {
                System.out.println(e);
                this.addActionError("Topo non trouvé. ID = " + topo_id);
            }
        }

        return (this.hasErrors()) ? ActionSupport.ERROR : ActionSupport.SUCCESS;
    }
}
