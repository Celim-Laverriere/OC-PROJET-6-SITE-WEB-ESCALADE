package org.escalade.business.contract.manager;

import org.escalade.model.bean.Secteur;

import java.util.List;

public interface SecteurManager {

    List<Secteur> secteurs(Integer site_id);

    String addSecteur(Secteur secteur);

    Secteur secteur(Integer id);

    String delScteur(Integer id);

    String upSecteur(Integer id, Secteur secteur);
}
