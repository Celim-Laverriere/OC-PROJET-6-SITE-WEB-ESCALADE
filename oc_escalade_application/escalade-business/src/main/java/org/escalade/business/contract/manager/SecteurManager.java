package org.escalade.business.contract.manager;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Voie;

import java.util.List;

public interface SecteurManager {

    List<Secteur> secteurs();

    void addSecteur(Secteur secteur, Integer site_id);

    Secteur secteur(Integer id);

    String delScteur(Integer id);

    String upSecteur(Integer id, Secteur secteur);

    List<Secteur> rechercheSimpleParSecteur(String motCleRecherche);

    /**
     * Renvoie le(s) secteur(s) correspondant aux voies trouver lors de la recherche,
     * dans la "barre de recherche" du navigateur.
     * @param voies
     * @return secteurs
     */
    List<Secteur> rechercheSecteurParVoie(List<Voie> voies);

    List<Secteur> secteursParSessionDeCompte(Compte compte);
}
