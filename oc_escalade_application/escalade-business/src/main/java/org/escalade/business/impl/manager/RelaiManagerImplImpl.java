package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.RelaiManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Relai;

import java.util.List;

public class RelaiManagerImplImpl extends AbstractManagerImpl implements RelaiManager {

    @Override
    public List<Relai> relais() {
        return getDaoFactory().getRelaiDao().relais();
    }

    @Override
    public String addRelai(Relai relai) {
        return getDaoFactory().getRelaiDao().addRelai(relai);
    }

    @Override
    public Relai relai(Integer id) {
        return getDaoFactory().getRelaiDao().relai(id);
    }

    @Override
    public String delRelai(Integer id) {
        return getDaoFactory().getRelaiDao().delRelai(id);
    }

    @Override
    public String upRelai(Integer id, Relai relai) {
        return getDaoFactory().getRelaiDao().upRelai(id, relai);
    }
}
