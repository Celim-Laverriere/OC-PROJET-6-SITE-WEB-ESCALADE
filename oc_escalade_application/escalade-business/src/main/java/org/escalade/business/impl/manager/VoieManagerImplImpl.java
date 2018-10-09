package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.VoieManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Voie;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;


public class VoieManagerImplImpl extends AbstractManagerImpl implements VoieManager {

    public List<Voie> voies() {
        return getDaoFactory().getVoieDao().voies();
    }

    public String addVoie(Voie voie) {
        return getDaoFactory().getVoieDao().addVoie(voie);
    }

    public Voie voie(Integer id) {
        return getDaoFactory().getVoieDao().voie(id);
    }

    public String delVoie(Integer id) {
        return getDaoFactory().getVoieDao().delVoie(id);
    }

    public String upVoie(Voie voie) {
        return getDaoFactory().getVoieDao().upVoie(voie);
    }
}
