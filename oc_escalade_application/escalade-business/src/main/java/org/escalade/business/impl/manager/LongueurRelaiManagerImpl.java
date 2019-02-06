package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.LongueurRelaiManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.LongueurRelai;
import java.util.List;

public class LongueurRelaiManagerImpl extends AbstractManagerImpl implements LongueurRelaiManager {

    @Override
    public List<LongueurRelai> longueursRelai(Integer voie_id) {
        return getDaoFactory().getLongueurRelaiDao().longueursRelai(voie_id);
    }

    @Override
    public String addLongueurRelai(LongueurRelai longueur) {
        return getDaoFactory().getLongueurRelaiDao().addLongueurRelai(longueur);
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
}
