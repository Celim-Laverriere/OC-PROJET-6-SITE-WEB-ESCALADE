package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Compte;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class CompteAction extends ActionSupport implements SessionAware, ServletRequestAware {


    // ======================== Attributs =======================
    // ===== Paramètres en entrée =====
    private Compte upCompte;

    // ===== Paramètres en sortie =====
    private Compte compte;

    // ----- Eléments Struts
    private Map<String, Object> session;
    private HttpServletRequest servletRequest;

    @Inject
    private ManagerFactory managerFactory;

    // ==================== Getters/Setters =====================

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Compte getUpCompte() {
        return upCompte;
    }

    public void setUpCompte(Compte upCompte) {
        this.upCompte = upCompte;
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

    /**
     * Action de mise à jour des informations de compte
     * @return success / error
     */
    public String upCompte(){
        String vResult = ActionSupport.INPUT;

        try {
            managerFactory.getCompteManager().upCompte(upCompte, (Compte) this.session.get("user"));

            vResult = ActionSupport.SUCCESS;

            this.addActionMessage("Vos modifications ont bien été pris en compte !");

        } catch (NullPointerException pEX){
            compte = managerFactory.getCompteManager().compte((Compte) this.session.get("user"));
        } catch (Exception pEX) {

            this.addActionError("Une erreur s'est produite, veuillez réessayer ultérieurement !" );
        }

        return vResult;
    }

    public String supprimerCompteUtilisateur (){
        String vResult = ActionSupport.INPUT;

        try {

            managerFactory.getCompteManager().delCompte((Compte) this.session.get("user"));

            vResult = ActionSupport.SUCCESS;

            this.servletRequest.getSession().invalidate();

            this.addActionMessage("Votre compte à bien été supprimer !");

        } catch (NullPointerException pEX) {
            compte = managerFactory.getCompteManager().compte((Compte) this.session.get("user"));
        } catch (Exception pEX) {
            System.out.println(pEX);
            this.addActionError("Une erreur s'est produite, veuillez réessayer ultérieurement !");
        }

        return vResult;
    }

    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    @Override
    public void setServletRequest(HttpServletRequest pRequest) {
        this.servletRequest = pRequest;
    }
}
