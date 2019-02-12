package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.LongueurRelai;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Voie;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class formulaireSiteComplet extends ActionSupport implements SessionAware, ServletRequestAware {

    // ======================== Attributs =======================

    // ===== Paramètres en entrée =====
    private String configSelectFormulaire;

    private Site site;
    private Secteur secteur;
    private Voie voie;
    private LongueurRelai longueurRelai;

    // ===== Paramètres en sortie =====
    private List<String> regions = new ArrayList(Arrays.asList("Ile-de-France", "Champagne-Ardenne", "Picardie",
            "Haute-Normandie", "Centre", "Basse-Normandie", "Bourgogne", "Nord-Pas-de-Calais", "Lorraine", "Alsace",
            "Franche-Comté", "Pays de la Loire", "Bretagne", "Poitou-Charentes", "Aquitaine", "Midi-Pyrénées",
            "Limousin", "Rhône-Alpes", "Auvergne", "Languedoc-Roussillon", "Provence-Alpes-Côte d'Azur",
            "Corse", "Guadeloupe", "Martinique", "Guyane", "La Réunion", "Mayotte"));

    private  List<String> types_voie = new ArrayList(Arrays.asList("Non équipée", "Equipée"));

    private List<String> cotations = new ArrayList(Arrays.asList("1", "2", "3", "4", "5a", "5b", "5c", "6a", "6a+", "6b",
        "6b+", "6c", "6c+", "7a", "7a+", "7b", "7b+", "7c", "7c+", "8a", "8a+", "8b", "8b+", "8c", "8c+", "9a", "9a+",
        "9b", "9b+", "9c"));


    // ----- Eléments Struts

    private Map<String, Object> session;
    private HttpServletRequest servletRequest;

    @Inject
    private ManagerFactory managerFactory;

    // ==================== Getters/Setters =====================

    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    public List<String> getTypes_voie() {
        return types_voie;
    }

    public void setTypes_voie(List<String> types_voie) {
        this.types_voie = types_voie;
    }

    public List<String> getCotations() {
        return cotations;
    }

    public void setCotations(List<String> cotations) {
        this.cotations = cotations;
    }

    public String getConfigSelectFormulaire() {
        return configSelectFormulaire;
    }

    public void setConfigSelectFormulaire(String configSelectFormulaire) {
        this.configSelectFormulaire = configSelectFormulaire;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Secteur getSecteur() {
        return secteur;
    }

    public void setSecteur(Secteur secteur) {
        this.secteur = secteur;
    }

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    public LongueurRelai getLongueurRelai() {
        return longueurRelai;
    }

    public void setLongueurRelai(LongueurRelai longueurRelai) {
        this.longueurRelai = longueurRelai;
    }

// ======================== Méthodes ========================

    public String completeCreationClimbingSite(){

        String vResult = ActionSupport.INPUT;

        try {

            switch (configSelectFormulaire) {

                case "formulaireSite":
                    System.out.println(site.getNom());
                    configSelectFormulaire = "formulaireSecteur";
                    break;
                case "formulaireSecteur":
                    System.out.println(secteur.getNom());
                    configSelectFormulaire = "formulaireVoie";
                    break;
                case "formulaireVoie":
                    System.out.println(voie.getNom());
                    System.out.println(voie.getType_voie());
                    configSelectFormulaire = "formulaireLongueurRelai";
                    break;
                case "formulaireLongueurRelai":
                    System.out.println(voie.getNom());
                    configSelectFormulaire = "formulaireLongueurRelai";
                    break;
            }

        } catch (NullPointerException pEX){
            configSelectFormulaire = "formulaireSite";
        } catch (Exception pEX){

        }

        return vResult;
    }

    // ======================== Session =========================
    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }

    @Override
    public void setServletRequest(HttpServletRequest pRequest) {
        this.servletRequest = pRequest;
    }


}
