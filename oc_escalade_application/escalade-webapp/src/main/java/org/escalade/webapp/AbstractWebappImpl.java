package org.escalade.webapp;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Site;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe de helper temporaire pour la webapp...
 */
public abstract class AbstractWebappImpl extends ActionSupport {

    // ================ Manager Factory ================
    private static ManagerFactory managerFactory;

    public static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        AbstractWebappImpl.managerFactory = managerFactory;
    }

    // ================ Recuperation de la liste des Régions ================
    private List<Site> regionList = new ArrayList<>();

    public List<Site> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Site> regionList) {
        this.regionList = regionList;
    }

    /**
     * Action peuplant la liste des régions dans le formulaire de recherche
     * @return success
     */
    protected void fillRegion(){
        regionList = getManagerFactory().getSiteManager().sites();
    }

}
