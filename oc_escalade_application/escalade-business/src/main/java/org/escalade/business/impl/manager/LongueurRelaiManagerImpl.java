package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.LongueurRelaiManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.LongueurRelai;
import org.escalade.model.bean.Voie;

import java.util.List;

public class LongueurRelaiManagerImpl extends AbstractManagerImpl implements LongueurRelaiManager {

    @Override
    public List<LongueurRelai> longueursRelai(Integer voie_id) {
        return getDaoFactory().getLongueurRelaiDao().longueursRelai(voie_id);
    }

    @Override
    public void addLongueurRelai(LongueurRelai longueur, Voie voie) {
        /**@see org.escalade.consumer.impl.dao.LongueurRelaiImpl#addLongueurRelai(LongueurRelai, Voie) */
        getDaoFactory().getLongueurRelaiDao().addLongueurRelai(longueur, voie);
    }

    @Override
    public LongueurRelai longueurRelai(Integer id) {
        return getDaoFactory().getLongueurRelaiDao().longueurRelai(id);
    }

    @Override
    public void delLongueurRelai(Integer id) {
        /**@see org.escalade.consumer.impl.dao.LongueurRelaiImpl#delLongueurRelai(Integer)*/
        getDaoFactory().getLongueurRelaiDao().delLongueurRelai(id);
    }

    @Override
    public void upLongueur(List<LongueurRelai> longueurs) {

        for (LongueurRelai longueur : longueurs){
            /**@see org.escalade.consumer.impl.dao.LongueurRelaiImpl#upLongueur(LongueurRelai)*/
            getDaoFactory().getLongueurRelaiDao().upLongueur(longueur);
        }
    }

    public List<LongueurRelai> listLongueursByVoie(Voie voie){

        /**@see org.escalade.consumer.impl.dao.LongueurRelaiImpl#listLongueursByVoieDao(Voie)*/
        List<LongueurRelai> longueurRelaiList = getDaoFactory().getLongueurRelaiDao().listLongueursByVoieDao(voie);
        return longueurRelaiList;
    }

    /**
     * Cette méthode transmet à la couche consumer les longueurs une à une pour les ajouter à la base de données.
     * @param longueurs
     * @param voie
     */
    public void addLongueurWorkflow(List<LongueurRelai> longueurs, Voie voie) {

        for (LongueurRelai longueurRelai : longueurs){

            /**@see org.escalade.consumer.impl.dao.LongueurRelaiImpl#addLongueurRelai(LongueurRelai, Voie)*/
            getDaoFactory().getLongueurRelaiDao().addLongueurRelai(longueurRelai, voie);
        }
    }
}
