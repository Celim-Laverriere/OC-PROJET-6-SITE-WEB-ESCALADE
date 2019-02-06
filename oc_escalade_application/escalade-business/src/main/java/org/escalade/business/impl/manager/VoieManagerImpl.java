package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.VoieManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.LongueurRelai;
import org.escalade.model.bean.Voie;
import java.util.List;


public class VoieManagerImpl extends AbstractManagerImpl implements VoieManager {

    public List<Voie> voies(Integer secteur_id) {
        return getDaoFactory().getVoieDao().voies(secteur_id);
    }

    public String addVoie(Voie voie) {
        return getDaoFactory().getVoieDao().addVoie(voie);
    }

    public Voie voie(Integer id) {
        Voie voie = getDaoFactory().getVoieDao().voie(id);

        List<LongueurRelai> longueursRelais = getDaoFactory().getLongueurRelaiDao().longueursRelai(voie.getId());
        voie.setLongueursRelais(longueursRelais);

        return voie;
    }

    public String delVoie(Integer id) {
        return getDaoFactory().getVoieDao().delVoie(id);
    }

    public String upVoie(Voie voie) {
        return getDaoFactory().getVoieDao().upVoie(voie);
    }

    @Override
    public List<Voie> rechercheSimpleParVoie(String motCleRecherche) {
        List<Voie> voies = getDaoFactory().getVoieDao().rechercheSimpleParVoieDao(motCleRecherche);
        return voies;
    }
}
