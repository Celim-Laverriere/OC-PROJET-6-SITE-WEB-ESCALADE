package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Messagerie;
import org.escalade.model.bean.ResaTopo;
import org.escalade.model.bean.Topo;

import javax.inject.Inject;
import java.util.Map;

public class ResaTopoAction extends ActionSupport implements SessionAware {

    // ======================== Attributs =======================

    // ===== Paramètres en entrée =====

    private Integer topo_id;
    private Messagerie messagerie;
    private ResaTopo resaTopo;

    // ===== Paramètres en sortie =====

    private Topo topo;

    // ----- Eléments Struts
    private Map<String, Object> session;

    @Inject
    private ManagerFactory managerFactory;

    // ==================== Getters/Setters =====================

    public Integer getTopo_id() {
        return topo_id;
    }

    public void setTopo_id(Integer topo_id) {
        this.topo_id = topo_id;
    }

    public Topo getTopo() {
        return topo;
    }

    public void setTopo(Topo topo) {
        this.topo = topo;
    }

    public Messagerie getMessagerie() {
        return messagerie;
    }

    public void setMessagerie(Messagerie messagerie) {
        this.messagerie = messagerie;
    }

    public ResaTopo getResaTopo() {
        return resaTopo;
    }

    public void setResaTopo(ResaTopo resaTopo) {
        this.resaTopo = resaTopo;
    }

    // ======================== Méthodes ========================

    public String resaTopo(){

    String vResult = ActionSupport.INPUT;

    try {
        /**@see org.escalade.business.impl.manager.TopoManagerImpl#topo(Integer)*/
        topo = managerFactory.getTopoManager().topo(topo_id);

    } catch (Exception pEX){

        /**@see org.escalade.business.impl.manager.TopoManagerImpl#topo(Integer)*/
        topo = managerFactory.getTopoManager().topo(topo_id);

    }

    return vResult;
}

    // ======================== Session =========================
    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
}
