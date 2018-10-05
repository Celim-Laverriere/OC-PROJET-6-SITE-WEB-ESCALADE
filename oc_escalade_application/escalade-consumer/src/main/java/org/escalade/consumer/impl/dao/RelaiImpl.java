package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.RelaiDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Relai;

import java.util.List;

public class RelaiImpl extends AbstractDataImpl implements RelaiDao {

    @Override
    public List<Relai> relais() {
        return null;
    }

    @Override
    public String addRelai(Relai relai) {
        return null;
    }

    @Override
    public Relai relai(Integer id) {
        return null;
    }

    @Override
    public String delRelai(Integer id) {
        return null;
    }

    @Override
    public String upRelai(Integer id, Relai relai) {
        return null;
    }
}
