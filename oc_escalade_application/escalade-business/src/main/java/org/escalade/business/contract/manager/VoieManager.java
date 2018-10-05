package org.escalade.business.contract.manager;

import org.escalade.model.bean.Voie;

import java.util.HashMap;
import java.util.List;

public interface VoieManager {

    public List<Voie> voies();

    public String addVoie(Voie voie);

    public Voie voie(Integer id);

    public String delVoie(Integer id);

    public String upVoie(Voie voie );
}
