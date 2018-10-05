package org.escalade.webapp;

import com.opensymphony.xwork2.ActionSupport;
import org.escalade.business.contract.ManagerFactory;

/**
 * Classe de helper temporaire pour la webapp...
 */
public abstract class AbstractWebappImpl extends ActionSupport {

    private static ManagerFactory managerFactory;

    public static ManagerFactory getManagerFactory() {
        return managerFactory;
    }

    public static void setManagerFactory(ManagerFactory managerFactory) {
        AbstractWebappImpl.managerFactory = managerFactory;
    }
}
