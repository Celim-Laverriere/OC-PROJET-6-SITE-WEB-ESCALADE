package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.LongueurManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Longueur;

import java.util.List;

public class LongueurManagerImplImpl extends AbstractManagerImpl implements LongueurManager {

    @Override
    public List<Longueur> longueurs() {
        return getDaoFactory().getLongueurDao().longueurs();
    }

    @Override
    public String addLongueur(Longueur longueur) {
        return getDaoFactory().getLongueurDao().addLongueur(longueur);
    }

    @Override
    public Longueur longueur(Integer id) {
        return getDaoFactory().getLongueurDao().longueur(id);
    }

    @Override
    public String delLongueur(Integer id) {
        return getDaoFactory().getLongueurDao().delLongueur(id);
    }

    @Override
    public String upLongueur(Integer id, Longueur longueur) {
        return getDaoFactory().getLongueurDao().upLongueur(id, longueur);
    }
}
