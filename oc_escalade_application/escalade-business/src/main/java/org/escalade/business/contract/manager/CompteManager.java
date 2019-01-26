package org.escalade.business.contract.manager;

import org.escalade.model.bean.Compte;

import java.util.List;

public interface CompteManager {

    List<Compte> comptes();

    void addCompte(Compte compte);

    Compte compte(Integer id);

    String delCompte(Integer id);

    String upCompte(Integer id, Compte compte);

    Compte comptByUtilisateur (String login, String password);
}
