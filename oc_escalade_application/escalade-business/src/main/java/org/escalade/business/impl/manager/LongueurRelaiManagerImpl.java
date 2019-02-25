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
        getDaoFactory().getLongueurRelaiDao().addLongueurRelai(longueur, voie);
    }

    @Override
    public LongueurRelai longueurRelai(Integer id) {
        return getDaoFactory().getLongueurRelaiDao().longueurRelai(id);
    }

    @Override
    public String delLongueurRelai(Integer id) {
        return getDaoFactory().getLongueurRelaiDao().delLongueurRelai(id);
    }

    @Override
    public String upLongueurRelai(Integer id, LongueurRelai longueur) {
        return getDaoFactory().getLongueurRelaiDao().upLongueurRelai(id, longueur);
    }

    /**
     *
     * @param longueurs
     * @param voie
     * @see org.escalade.consumer.impl.dao.LongueurRelaiImpl#recoversLongueurWorkflowDao(LongueurRelai, Voie)
     */
    public void addLongueurWorkflow(List<LongueurRelai> longueurs, Voie voie) {

        for (LongueurRelai longueuRelai : longueurs){
            getDaoFactory().getLongueurRelaiDao().addLongueurRelai(longueuRelai, voie);
        }
    }
}
