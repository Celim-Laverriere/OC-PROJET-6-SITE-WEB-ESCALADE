package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.CompteManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Compte;

import java.util.ArrayList;
import java.util.List;

public class CompteManagerImpl extends AbstractManagerImpl implements CompteManager {

    @Override
    public List<Compte> comptes() {
        return getDaoFactory().getCompteDao().comptes();
    }

    @Override
    public void addCompte(Compte compte) {
        getDaoFactory().getCompteDao().addCompte(compte);
    }

    @Override
    public Compte compte(Compte compte_id) {
        return getDaoFactory().getCompteDao().compte(compte_id);
    }

    @Override
    public void delCompte(Compte compte_id) {

        getDaoFactory().getCompteDao().delCompte(compte_id.getId());
    }

    @Override
    public void upCompte(Compte upComte, Compte compte) {
         getDaoFactory().getCompteDao().upCompte(upComte, compte);
    }

    @Override
    public Compte comptByUtilisateur(String login, String password) {

        Compte vUtilisateur = getDaoFactory().getCompteDao().comptByUtilisateur(login, password);
        return vUtilisateur;
    }


}
