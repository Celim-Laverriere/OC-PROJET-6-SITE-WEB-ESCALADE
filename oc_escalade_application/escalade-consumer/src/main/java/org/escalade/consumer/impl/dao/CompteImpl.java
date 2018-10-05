package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.CompteDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Compte;

import java.util.List;

public class CompteImpl extends AbstractDataImpl implements CompteDao {

    @Override
    public List<Compte> comptes() {
        return null;
    }

    @Override
    public String addCompte(Compte compte) {
        return null;
    }

    @Override
    public Compte compte(Integer id) {
        return null;
    }

    @Override
    public String delCompte(Integer id) {
        return null;
    }

    @Override
    public String upCompte(Integer id, Compte compte) {
        return null;
    }
}
