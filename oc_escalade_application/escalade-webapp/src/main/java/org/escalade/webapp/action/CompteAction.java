package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Compte;

import javax.inject.Inject;
import java.util.Map;

public class CompteAction extends ActionSupport implements SessionAware {


    // ======================== Attributs =======================
    // ===== Paramètres en entrée =====
    private Compte compte;

    // ===== Paramètres en sortie =====


    // ----- Eléments Struts

    @Inject
    private ManagerFactory managerFactory;

    // ==================== Getters/Setters =====================

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }


    // ======================== Méthodes ========================

    /**
     * Action de création d'un nouveau compte
     * @return success / error
     */
    public String doCreate(){

        String vResult = ActionSupport.INPUT;

        try {
            managerFactory.getCompteManager().addCompte(compte);
            vResult = ActionSupport.SUCCESS;

        } catch (NullPointerException pEX){

        } catch (Exception pEX) {
            this.addActionError("Une erreur technique s'est produite, votre compte n'a pas pu être ajouté !");
        }

        return vResult;
    }

    @Override
    public void setSession(Map<String, Object> session) {

    }
}
