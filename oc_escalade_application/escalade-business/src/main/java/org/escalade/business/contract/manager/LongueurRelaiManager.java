package org.escalade.business.contract.manager;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.LongueurRelai;
import org.escalade.model.bean.Voie;

import java.util.List;

public interface LongueurRelaiManager {

    List<LongueurRelai> longueursRelai(Integer voie_id);

    void addLongueurRelai(LongueurRelai longueur, Voie voie);

    LongueurRelai longueurRelai(Integer id);

    void delLongueurRelai(Integer id);

    String upLongueurRelai(Integer id, LongueurRelai longueur);

    List<LongueurRelai> listLongueursByVoie(Voie voie);

    void addLongueurWorkflow(List<LongueurRelai> longueur, Voie voie);
}
