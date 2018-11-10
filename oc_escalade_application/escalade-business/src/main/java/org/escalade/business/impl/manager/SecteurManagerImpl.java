package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.SecteurManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;

import java.util.List;

public class SecteurManagerImpl extends AbstractManagerImpl implements SecteurManager {

    @Override
    public List<Secteur> secteurs() {
        return getDaoFactory().getSecteurDao().secteurs();
    }

    @Override
    public void addSecteur(Secteur secteur, Site site) {
        getDaoFactory().getSecteurDao().addSecteur(secteur, site);
    }

    @Override
    public Secteur secteur(Integer id) {
        return getDaoFactory().getSecteurDao().secteur(id);
    }

    @Override
    public String delScteur(Integer id) {
        return getDaoFactory().getSecteurDao().delSecteur(id);
    }

    @Override
    public String upSecteur(Integer id, Secteur secteur) {
        return getDaoFactory().getSecteurDao().upSecteur(id, secteur);
    }
}
