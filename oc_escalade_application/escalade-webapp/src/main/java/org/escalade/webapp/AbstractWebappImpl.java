package org.escalade.webapp;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.business.contract.ManagerFactory;

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

    // ================ Formulaire de moteur de recherche ================
    private List<String> regionList = new ArrayList<>();

    public List<String> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<String> regionList) {
        this.regionList = regionList;
    }

    /**
     * Action peuplant la liste des régions dans le formulaire de recherche
     * @return success
     */
    public String getRegion(){
        regionList = getManagerFactory().getSiteManager().regions();
        return ActionSupport.SUCCESS;
    }
}
