package org.escalade.webapp.action;
import com.opensymphony.xwork2.ActionSupport;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Voie;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SearchEngineAction extends ActionSupport  {

    // ============ Eléments en entrée  ============

    private String motCleRecherche;
    private String regionSelect;
    private String typeVoieSelect;
    private String cotationVoieSelect;

    // ============ Eléments en sortie ============

    private List<String> listRegions = new ArrayList(Arrays.asList("Ile-de-France", "Champagne-Ardenne", "Picardie",
            "Haute-Normandie", "Centre", "Basse-Normandie", "Bourgogne", "Nord-Pas-de-Calais", "Lorraine", "Alsace",
            "Franche-Comté", "Pays de la Loire", "Bretagne", "Poitou-Charentes", "Aquitaine", "Midi-Pyrénées",
            "Limousin", "Rhône-Alpes", "Auvergne", "Languedoc-Roussillon", "Provence-Alpes-Côte d'Azur",
            "Corse", "Guadeloupe", "Martinique", "Guyane", "La Réunion", "Mayotte"));

    // Liste de sélection de la difficulté par ordre croissant de 3 à 9 des voies.
    private List<String> listCotations = new ArrayList(Arrays.asList("1", "2", "3", "4", "5a", "5b", "5c", "6a", "6a+", "6b",
            "6b+", "6c", "6c+", "7a", "7a+", "7b", "7b+", "7c", "7c+", "8a", "8a+", "8b", "8b+", "8c", "8c+", "9a", "9a+",
            "9b", "9b+", "9c"));

    // Liste de sélection, voies équipée ou non équipée.
    private  List<String> listTypesVoie = new ArrayList(Arrays.asList("Non équipée", "Equipée"));

    private List<Site> sites;
    private List<Voie> voies;
    private List<Secteur> secteurs;

    private Site site;
    private Secteur secteur;
    private Voie voie;

    private List<Site> secteursRefSite;
    private List<Secteur> voiesRefSecteur;
    private List<Site> voiesRefSecteurRefSite;

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

    public List<String> getListRegions() {
        return listRegions;
    }

    public void setListRegions(List<String> listRegions) {
        this.listRegions = listRegions;
    }

    public List<String> getListCotations() {
        return listCotations;
    }

    public void setListCotations(List<String> listCotations) {
        this.listCotations = listCotations;
    }

    public List<String> getListTypesVoie() {
        return listTypesVoie;
    }

    public void setListTypesVoie(List<String> listTypesVoie) {
        this.listTypesVoie = listTypesVoie;
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

    public List<Site> getSecteursRefSite() {
        return secteursRefSite;
    }

    public void setSecteursRefSite(List<Site> secteursRefSite) {
        this.secteursRefSite = secteursRefSite;
    }

    public List<Secteur> getVoiesRefSecteur() {
        return voiesRefSecteur;
    }

    public void setVoiesRefSecteur(List<Secteur> voiesRefSecteur) {
        this.voiesRefSecteur = voiesRefSecteur;
    }

    public List<Site> getVoiesRefSecteurRefSite() {
        return voiesRefSecteurRefSite;
    }

    public void setVoiesRefSecteurRefSite(List<Site> voiesRefSecteurRefSite) {
        this.voiesRefSecteurRefSite = voiesRefSecteurRefSite;
    }

    // =============== Méthodes ================

    /**
     * Action qui retourne la liste des sites correspondant à la région sélectionnée
     * au type de la voie (équpée ou non) et à la difficultée de la voie.
     * @return success
     */
    public String doAdvancedSearch(){

        String vResult = ActionSupport.INPUT;

        try {

            if (this.regionSelect != null){
                /**@see org.escalade.business.impl.manager.SiteManagerImpl#sitesByAdvancedSearch(String, String, String)*/
                sites = managerFactory.getSiteManager().sitesByAdvancedSearch(regionSelect, typeVoieSelect, cotationVoieSelect);
                vResult = ActionSupport.SUCCESS;
            }

        } catch (Exception pEX){

        }

        return vResult;
    }

    public String doSimpleSearch(){

        try {

            /**@see org.escalade.business.impl.manager.SiteManagerImpl#siteBySimpleSearch(String) */
            sites = managerFactory.getSiteManager().siteBySimpleSearch(motCleRecherche);

            /**@see org.escalade.business.impl.manager.SecteurManagerImpl#secteurBySimpleSearch(String) */
            secteurs = managerFactory.getSecteurManager().secteurBySimpleSearch(motCleRecherche);

            if (!secteurs.isEmpty()){
                secteursRefSite = managerFactory.getSiteManager().searchSiteBySector(secteurs);
            }

            voies = managerFactory.getVoieManager().rechercheSimpleParVoie(motCleRecherche);

            if (!voies.isEmpty()){
                voiesRefSecteur = managerFactory.getSecteurManager().rechercheSecteurParVoie(voies);
                voiesRefSecteurRefSite = managerFactory.getSiteManager().searchSiteBySector(voiesRefSecteur);
            }

        } catch (IndexOutOfBoundsException pEx) {
            this.addActionMessage("Désolé ! Aucun site ne correspond à votre recherche : " + motCleRecherche + " !");
        }

        return ActionSupport.SUCCESS;
    }

}
