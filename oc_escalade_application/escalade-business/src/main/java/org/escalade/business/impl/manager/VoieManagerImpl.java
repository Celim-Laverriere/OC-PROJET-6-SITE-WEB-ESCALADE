package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.VoieManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Longueur;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Voie;
import java.util.List;


public class VoieManagerImpl extends AbstractManagerImpl implements VoieManager {

    public List<Voie> voies(Integer secteur_id) {
        return getDaoFactory().getVoieDao().voies(secteur_id);
    }

    public void addVoie(Voie voie, Secteur secteur) {
        /**@see org.escalade.consumer.impl.dao.VoieImpl#addVoie(Voie, Secteur) */
         getDaoFactory().getVoieDao().addVoie(voie,secteur);
    }

    public Voie voie(Integer id) {

        /**@see org.escalade.consumer.impl.dao.VoieImpl#voie(Integer)*/
        Voie voie = getDaoFactory().getVoieDao().voie(id);

        List<Longueur> longueursRelais = getDaoFactory().getLongueurDao().longueurs(voie.getId());
        voie.setLongueursRelais(longueursRelais);

        return voie;
    }

    public void delVoie(Integer id) {

        /**@see org.escalade.consumer.impl.dao.VoieImpl#delVoie(Integer)*/
        getDaoFactory().getVoieDao().delVoie(id);
    }

    public void upVoie(Voie voie) {

        /**@see org.escalade.consumer.impl.dao.VoieImpl#upVoie(Voie)*/
        getDaoFactory().getVoieDao().upVoie(voie);
    }

    @Override
    public List<Voie> rechercheSimpleParVoie(String motCleRecherche) {
        List<Voie> voies = getDaoFactory().getVoieDao().rechercheSimpleParVoieDao(motCleRecherche);
        return voies;
    }

    public List<Voie> listVoiesByAccount(Compte compte){

        /**@see  org.escalade.consumer.impl.dao.VoieImpl#listVoiesByAccountDao(Compte)*/
        List<Voie> listVoies = getDaoFactory().getVoieDao().listVoiesByAccountDao(compte);
        return listVoies;
    }


    /**
     *
     * @param voie
     * @param secteur
     * @see org.escalade.consumer.impl.dao.VoieImpl#recoversVoieWorkflowDao(Voie, Secteur)
     * @return vVoie
     */
    public Voie addVoieWorkflow (Voie voie, Secteur secteur){

        getDaoFactory().getVoieDao().addVoie(voie, secteur);
        Voie vVoie = getDaoFactory().getVoieDao().recoversVoieWorkflowDao(voie, secteur);

        return vVoie;
    }
}
