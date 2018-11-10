package org.escalade.business.contract.manager;

import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;

import java.util.List;

public interface SecteurManager {

    List<Secteur> secteurs();

    void addSecteur(Secteur secteur, Site site);

    Secteur secteur(Integer id);

    String delScteur(Integer id);

    String upSecteur(Integer id, Secteur secteur);
}
