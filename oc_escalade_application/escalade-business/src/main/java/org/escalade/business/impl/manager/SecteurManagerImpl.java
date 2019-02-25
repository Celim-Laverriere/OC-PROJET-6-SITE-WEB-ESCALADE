package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.SecteurManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Voie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecteurManagerImpl extends AbstractManagerImpl implements SecteurManager {

    @Override
    public List<Secteur> secteurs() {
        return getDaoFactory().getSecteurDao().secteurs();
    }

    @Override
    public void addSecteur(Secteur secteur, Integer site_id) {
        getDaoFactory().getSecteurDao().addSecteur(secteur, site_id);
    }

    @Override
    public Secteur secteur(Integer id) {
        Secteur secteur = getDaoFactory().getSecteurDao().secteur(id);
        List<Voie> voies = getDaoFactory().getVoieDao().voies(id);

        secteur.setVoies(voies);

        return secteur;
    }

    @Override
    public String delScteur(Integer id) {
        return getDaoFactory().getSecteurDao().delSecteur(id);
    }

    @Override
    public String upSecteur(Integer id, Secteur secteur) {
        return getDaoFactory().getSecteurDao().upSecteur(id, secteur);
    }

    /**
     * Recherche le secteur en correspondance avec le mot-clé saisi par l'utilisateur.
     * @param motCleRecherche
     * @return secteurs
     */
    public List<Secteur> secteurBySimpleSearch(String motCleRecherche){

        /**@see org.escalade.consumer.impl.dao.SecteurImpl#secteurBySimpleSearchDao(String) */
        List<Secteur> secteurs = getDaoFactory().getSecteurDao().secteurBySimpleSearchDao(motCleRecherche);

        return secteurs;
    }

    /**
     * Renvoie le(s) secteur(s) correspondant aux voies trouver lors de la recherche,
     * dans la "barre de recherche" du navigateur.
     * @param voies
     * @return secteurs
     */
    public List<Secteur> rechercheSecteurParVoie(List<Voie> voies){

        List<Secteur> secteurs = new ArrayList<>();
        Set<Integer> voieSecteur_id = new HashSet<>();

        for (Voie voie: voies){
            voieSecteur_id.add(voie.getSecteur_id());
        }

        for (Integer secteur_id: voieSecteur_id){
            List<Secteur> secteursParVoie = getDaoFactory().getSecteurDao().rechercheSecteurParVoie(secteur_id);
            secteurs.addAll(secteursParVoie);
        }

        return secteurs;
    }

    public List<Secteur> secteursParSessionDeCompte(Compte compte){

       List<Secteur> vSecteurs = getDaoFactory().getSecteurDao().secteursParSessionDeCompteDao(compte);
       return vSecteurs;
    }

    /**
     * Ajoute le site  dscalade du Workflow
     * @param secteur
     * @param site
     * @see org.escalade.consumer.impl.dao.SecteurImpl#recoversSecteurWorkflowDao(Secteur, Site)
     * @return le Secteur du Workflow pour transmettre l'id du secteur à la voie
     */
    public Secteur addSecteurWorkflow (Secteur secteur, Site site){

        getDaoFactory().getSecteurDao().addSecteur(secteur, site.getId());
        Secteur vSecteur = getDaoFactory().getSecteurDao().recoversSecteurWorkflowDao(secteur, site);

        return vSecteur;
    }
}
