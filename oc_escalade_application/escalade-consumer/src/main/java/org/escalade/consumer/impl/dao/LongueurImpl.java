package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.LongueurDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Longueur;

import java.util.List;

public class LongueurImpl extends AbstractDataImpl implements LongueurDao {

    @Override
    public List<Longueur> longueurs() {
        return null;
    }

    @Override
    public String addLongueur(Longueur longueur) {
        return null;
    }

    @Override
    public Longueur longueur(Integer id) {
        return null;
    }

    @Override
    public String delLongueur(Integer id) {
        return null;
    }

    @Override
    public String upLongueur(Integer id, Longueur longueur) {
        return null;
    }
}
