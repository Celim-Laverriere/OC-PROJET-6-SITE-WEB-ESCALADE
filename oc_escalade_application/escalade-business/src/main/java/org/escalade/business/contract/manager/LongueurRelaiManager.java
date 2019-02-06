package org.escalade.business.contract.manager;

import org.escalade.model.bean.LongueurRelai;

import java.util.List;

public interface LongueurRelaiManager {

    List<LongueurRelai> longueursRelai(Integer voie_id);

    String addLongueurRelai(LongueurRelai longueur);

    LongueurRelai longueurRelai(Integer id);

    String delLongueurRelai(Integer id);

    String upLongueurRelai(Integer id, LongueurRelai longueur);
}
