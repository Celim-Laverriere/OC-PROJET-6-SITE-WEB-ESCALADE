package org.escalade.business.contract.manager;

import org.escalade.model.bean.LongueurRelai;
import org.escalade.model.bean.Voie;

import java.util.List;

public interface LongueurRelaiManager {

    List<LongueurRelai> longueursRelai(Integer voie_id);

    void addLongueurRelai(LongueurRelai longueur, Voie voie);

    LongueurRelai longueurRelai(Integer id);

    String delLongueurRelai(Integer id);

    String upLongueurRelai(Integer id, LongueurRelai longueur);

    void addLongueurWorkflow(List<LongueurRelai> longueur, Voie voie);
}
