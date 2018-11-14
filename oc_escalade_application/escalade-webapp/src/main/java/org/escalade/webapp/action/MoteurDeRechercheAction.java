package org.escalade.webapp.action;
import com.opensymphony.xwork2.ActionSupport;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Voie;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


public class MoteurDeRechercheAction extends ActionSupport  {

    // ============ Eléments en entrée  ============

    private String motCleRecherche;
    private String regionSelect;
    private String typeVoieSelect;
    private String cotationVoieSelect;

    // ============ Eléments en sortie ============
    private List<Site> regionList = new ArrayList<>();

    // Liste de sélection de la difficulté par ordre croissant de 3 à 9 des voies.
    private String cotationVoieList [] = {"3", "4", "5", "6", "7", "8", "9"};

    // Liste de sélection, voies équipée ou non équipée.
    private String typeVoie [] = {"Equipée", "Non équipée"};

    private List<Site> sites;
    private List<Voie> voies;
    private List<Secteur> secteurs;

    private Site site;
    private Secteur secteur;
    private Voie voie;

    @Inject
    private ManagerFactory managerFactory;

    // ============ Getters/Setters ============

    public String getRegionSelect() {
        return regionSelect;
    }

    public void setRegionSelect(String regionSelect) {
        this.regionSelect = regionSelect;
    }

    public List<Site> getSites() {
        return sites;
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public String getMotCleRecherche() {
        return motCleRecherche;
    }

    public void setMotCleRecherche(String motCleRecherche) {
        this.motCleRecherche = motCleRecherche;
    }

    public List<Site> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Site> regionList) {
        this.regionList = regionList;
    }

    public String[] getCotationVoieList() {
        return cotationVoieList;
    }

    public void setCotationVoieList(String[] cotationVoieList) {
        this.cotationVoieList = cotationVoieList;
    }

    public String[] getTypeVoie() {
        return typeVoie;
    }

    public void setTypeVoie(String[] typeVoie) {
        this.typeVoie = typeVoie;
    }

    public String getTypeVoieSelect() {
        return typeVoieSelect;
    }

    public void setTypeVoieSelect(String typeVoieSelect) {
        this.typeVoieSelect = typeVoieSelect;
    }

    public String getCotationVoieSelect() {
        return cotationVoieSelect;
    }

    public void setCotationVoieSelect(String cotationVoieSelect) {
        this.cotationVoieSelect = cotationVoieSelect;
    }

    public List<Secteur> getSecteurs() {
        return secteurs;
    }

    public void setSecteurs(List<Secteur> secteurs) {
        this.secteurs = secteurs;
    }

    public List<Voie> getVoies() {
        return voies;
    }

    public void setVoies(List<Voie> voies) {
        this.voies = voies;
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

    // =============== Méthodes ================

    /**
     * Action qui retourne la liste des sites correspondant à la région sélectionnée
     * @return success
     */
    public String doAdvancedSearch(){

        String vResult = ActionSupport.INPUT;

        if (this.regionSelect != null){
                sites = managerFactory.getSiteManager().sitesByAdvancedSearch(regionSelect, typeVoieSelect, cotationVoieSelect);
                vResult = ActionSupport.SUCCESS;
        }

        if (vResult.equals(ActionSupport.INPUT)){
            regionList = managerFactory.getSiteManager().siteByRegion();
        }

        return vResult;
    }

    public String doSimpleSearch(){

        String vResult = ActionSupport.INPUT;

        if (!motCleRecherche.equals(null)) {

            site = managerFactory.getSiteManager().siteBySimpleSearch(motCleRecherche);
            vResult = ActionSupport.SUCCESS;
//            if (site.getNom().equals(null)){
//                secteur = getManagerFactory().getSecteurManager().secteurByMotCleRecherche(motCleRecherche);
//            } else {
//                vResult = ActionSupport.SUCCESS;
//            }
//
//            if (secteur.getNom().equals(null) && site.getNom().equals(null)){
//                voie = getManagerFactory().getVoieManager().voieByMotCleRecherche(motCleRecherche);
//            }
//
//            if (secteur.getNom().equals(null) && site.getNom().equals(null) && voie.getNom().equals(null)){
//                this.addActionMessage("Désolé la recherche " + motCleRecherche
//                        + " ne correspond à aucun nom de site, de secteur ou de voie !");
//            }
//
//        } else {
//            this.addActionMessage("Merci de saisir votre demande dans la barre de recherche !");
        }


        return vResult;
    }

}
