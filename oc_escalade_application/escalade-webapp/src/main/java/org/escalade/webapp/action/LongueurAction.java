package org.escalade.webapp.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import org.escalade.business.contract.ManagerFactory;
import org.escalade.model.bean.LongueurRelai;
import org.escalade.model.bean.Voie;

import javax.inject.Inject;
import java.util.*;

public class LongueurAction extends ActionSupport implements SessionAware {

    // ======================== Attributs =======================
    // ----- Eléments en entrée -----
    private Voie voie;
    private String hauteur;


    // ----- Eléments en sortie -----
    private List<LongueurRelai> listLongueur;
    private LongueurRelai longueur;
    private Integer initNumLongueur;

    private List<String> cotations = new ArrayList(Arrays.asList("1", "2", "3", "4", "5a", "5b", "5c", "6a", "6a+", "6b",
            "6b+", "6c", "6c+", "7a", "7a+", "7b", "7b+", "7c", "7c+", "8a", "8a+", "8b", "8b+", "8c", "8c+", "9a", "9a+",
            "9b", "9b+", "9c"));

    // ----- Eléments Struts
    private Map<String, Object> session;

    @Inject
    private ManagerFactory managerFactory;

    // ============ Getters/Setters ============

    public Voie getVoie() {
        return voie;
    }

    public void setVoie(Voie voie) {
        this.voie = voie;
    }

    public List<LongueurRelai> getListLongueur() {
        return listLongueur;
    }

    public void setListLongueur(List<LongueurRelai> listLongueur) {
        this.listLongueur = listLongueur;
    }

    public List<String> getCotations() {
        return cotations;
    }

    public void setCotations(List<String> cotations) {
        this.cotations = cotations;
    }

    public String getHauteur() {
        return hauteur;
    }

    public void setHauteur(String hauteur) {
        this.hauteur = hauteur;
    }

    public LongueurRelai getLongueur() {
        return longueur;
    }

    public void setLongueur(LongueurRelai longueur) {
        this.longueur = longueur;
    }

    public Integer getInitNumLongueur() {
        return initNumLongueur;
    }

    public void setInitNumLongueur(Integer initNumLongueur) {
        this.initNumLongueur = initNumLongueur;
    }

    // =============== Méthodes ================

    // ===== Ajouter une nouvelle longueur =====

    public String newLongueur(){

        String vResult = ActionSupport.INPUT;

        try{

            initNumLongueur = (Integer) this.session.get("initNumLongueur");
            longueur.setNum_longueur(initNumLongueur);

            longueur.setHauteur(Float.parseFloat(hauteur));

            if (longueur.getNum_longueur() != 1){

                listLongueur = (List<LongueurRelai>) this.session.get("listLongueur");

                if (longueur.getNum_relai() != 0){
                    List<LongueurRelai> longueurListReverse = new ArrayList<>(listLongueur);
                    Collections.reverse(longueurListReverse);

                    for (LongueurRelai relais: longueurListReverse){
                        if (relais.getNum_relai() > 0){
                            int numRelai = relais.getNum_relai();
                            longueur.setNum_relai(numRelai + 1);
                            break;
                        }
                    }
                }
            }

            listLongueur = (List<LongueurRelai>) this.session.get("listLongueur");
            listLongueur.add(longueur);

            voie = (Voie) this.session.get("voie");

            /**@see org.escalade.business.impl.manager.LongueurRelaiManagerImpl#addLongueurRelai(LongueurRelai, Voie) */
            managerFactory.getLongueurRelaiManager().addLongueurRelai(longueur, voie);

            vResult = ActionSupport.SUCCESS;

        } catch (NullPointerException pEX){

            listLongueur = (List<LongueurRelai>) this.session.get("listLongueur");

            if (!listLongueur.isEmpty()){

                initNumLongueur  = (Integer) this.session.get("initNumLongueur");

                List<LongueurRelai> longueurRelaiListReverse = new ArrayList<>(listLongueur);
                Collections.reverse(longueurRelaiListReverse);

                for (LongueurRelai vLongueur : longueurRelaiListReverse){
                    int numLongueur = vLongueur.getNum_longueur();
                    initNumLongueur = numLongueur + 1;
                    this.session.put("initNumLongueur", initNumLongueur);
                    break;
                }
            }

            // Si le tableau des longueurs est vide on initialise le numéro de la première longueur
            if (listLongueur.isEmpty()){
                initNumLongueur = 1;
                this.session.put("initNumLongueur", initNumLongueur);
            }

        } catch (Exception pEX){

            this.addActionError("Une erreur technique s'est produite, veuillez réessayer plus tard!");
        }

        return vResult;
    }

    // ===== Supprimer une longueur =====
    public String delLongueur(){

        String vResult = ActionSupport.INPUT;

        try{

            listLongueur = (List<LongueurRelai>) this.session.get("listLongueur");

            for (LongueurRelai vLongueur : listLongueur){

                if(vLongueur.getNum_longueur() == longueur.getNum_longueur()){
                    longueur.setId(vLongueur.getId());
                }
            }

            voie = (Voie) this.session.get("voie");

            /**@see org.escalade.business.impl.manager.LongueurRelaiManagerImpl#delLongueurRelai(Integer)*/
            managerFactory.getLongueurRelaiManager().delLongueurRelai(longueur.getId());

            /**@see org.escalade.business.impl.manager.LongueurRelaiManagerImpl#listLongueursByVoie(Voie)*/
            listLongueur = managerFactory.getLongueurRelaiManager().listLongueursByVoie(voie);
            this.session.put("listLongueur", listLongueur);

            vResult = ActionSupport.SUCCESS;

        } catch (NullPointerException pEX) {

            listLongueur = (List<LongueurRelai>) this.session.get("listLongueur");

        } catch (Exception pEX){

        }

        return vResult;
    }

    public String longueurByVoie(){

        String vResult = null;

        try {

            /**@see org.escalade.business.impl.manager.LongueurRelaiManagerImpl#listLongueursByVoie(Voie)*/
            listLongueur = managerFactory.getLongueurRelaiManager().listLongueursByVoie(voie);
            this.session.put("listLongueur", listLongueur);

            /**@see org.escalade.business.impl.manager.VoieManagerImpl#voie(Integer) */
            voie = managerFactory.getVoieManager().voie(voie.getId());
            this.session.put("voie", voie);

            vResult = ActionSupport.SUCCESS;

        } catch (Exception pEX) {
            this.addActionError("Une erreur technique s'est produite, veuillez réessayer plus tard!");
        }

        return vResult;
    }

    // ======================== Session =========================
    @Override
    public void setSession(Map<String, Object> pSession) {
        this.session = pSession;
    }
}
