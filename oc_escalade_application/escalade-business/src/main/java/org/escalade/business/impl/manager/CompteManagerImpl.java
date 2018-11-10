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
    public String addCompte(Compte compte) {
        return getDaoFactory().getCompteDao().addCompte(compte);
    }

    @Override
    public Compte compte(Integer id) {
        return getDaoFactory().getCompteDao().compte(id);
    }

    @Override
    public String delCompte(Integer id) {
        return getDaoFactory().getCompteDao().delCompte(id);
    }

    @Override
    public String upCompte(Integer id, Compte compte) {
        return getDaoFactory().getCompteDao().upCompte(id, compte);
    }

}
