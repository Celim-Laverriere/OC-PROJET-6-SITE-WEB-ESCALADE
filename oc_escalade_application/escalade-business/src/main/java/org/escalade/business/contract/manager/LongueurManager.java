package org.escalade.business.contract.manager;

import org.escalade.model.bean.Longueur;

import java.util.List;

public interface LongueurManager {

    List<Longueur> longueurs();

    String addLongueur(Longueur longueur);

    Longueur longueur(Integer id);

    String delLongueur(Integer id);

    String upLongueur(Integer id, Longueur longueur);
}
