package org.escalade.business.contract.manager;

import org.escalade.model.bean.Compte;

import java.util.List;

public interface CompteManager {

    List<Compte> comptes();

    void addCompte(Compte compte);

    Compte compte(Compte compte_id);

    void delCompte(Compte compte_id);

    void upCompte(Compte upCompte, Compte compte);

    Compte comptByUtilisateur (String login, String password);
}
