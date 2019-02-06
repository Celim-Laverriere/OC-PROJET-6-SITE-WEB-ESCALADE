package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.SecteurManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Voie;

import java.util.List;

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
     *
     * @param motCleRecherche
     * @return
     */
    public List<Secteur> rechercheSimpleParSecteur(String motCleRecherche){
        List<Secteur> secteurs = getDaoFactory().getSecteurDao().rechercheSimpleParSecteurDao(motCleRecherche);
        return secteurs;
    }

    public List<Secteur> secteursParSessionDeCompte(Compte compte){

        return getDaoFactory().getSecteurDao().secteursParSessionDeCompteDao(compte);
    }
}
