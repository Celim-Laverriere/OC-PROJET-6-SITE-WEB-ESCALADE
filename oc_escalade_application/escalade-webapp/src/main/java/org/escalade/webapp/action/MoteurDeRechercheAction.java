package org.escalade.webapp.action;
import com.opensymphony.xwork2.ActionSupport;
import org.escalade.model.bean.Site;

import org.escalade.webapp.AbstractWebappImpl;

import java.util.ArrayList;
import java.util.List;


public class MoteurDeRechercheAction extends AbstractWebappImpl  {

    // ============ Eléments en entrée  ============

    private String motCleRecherche;
    private Site regionSelect;
    private String typeVoieSelect;
    private String cotationVoieSelect;



    // ============ Eléments en sortie ============
    private List<Site> regionList = new ArrayList<>();

    // Liste de sélection de la difficulté par ordre croissant de 3 à 9 des voies.
    private String cotationVoieList [] = {"3", "4", "5", "6", "7", "8", "9"};

    // Liste de sélection, voies équipée ou non équipée.
    private String typeVoie [] = {"Equipée", "Non équipée"};

    private List<Site> sites;


    // ============ Getters/Setters ============


    @Override
    public List<Site> getRegionList() {
        return regionList;
    }

    @Override
    public void setRegionList(List<Site> regionList) {
        this.regionList = regionList;
    }

    public Site getRegionSelect() {
        return regionSelect;
    }

    public void setRegionSelect(Site regionSelect) {
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

    // =============== Méthodes ================

    /**
     * Action qui retourne la liste des sites correspondant à la région sélectionnée
     * @return success
     */
    public String doRechercheAvancer(){

        String vResult = ActionSupport.INPUT;

        if (this.regionSelect != null){

            sites = getManagerFactory().getSiteManager().rechercheList(regionSelect, typeVoieSelect, cotationVoieSelect);

            for (Site site: sites){
               System.out.println(site.getNom() + " test2");
           }


            vResult = ActionSupport.SUCCESS;
        }

        if (vResult.equals(ActionSupport.INPUT)){

            regionList = getManagerFactory().getSiteManager().sites();

        }

       // this.addActionMessage("Liste des site d'éscalade de la région" + regionSelect.getRegion() + " !");

        return vResult;

    }

    public String doBarreDeRecherche(){


        return ActionSupport.SUCCESS;
    }

}
