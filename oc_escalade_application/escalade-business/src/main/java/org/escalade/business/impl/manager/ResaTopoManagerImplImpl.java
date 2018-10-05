package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.ResaTopoManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.ResaTopo;

import java.util.List;

public class ResaTopoManagerImplImpl extends AbstractManagerImpl implements ResaTopoManager {

    @Override
    public List<ResaTopo> resaTopos() {
        return getDaoFactory().getResaTopoDao().resaTopos();
    }

    @Override
    public String addResaTopo(ResaTopo resaTopo) {
        return getDaoFactory().getResaTopoDao().addResaTopo(resaTopo);
    }

    @Override
    public ResaTopo resaTopo(Integer id) {
        return getDaoFactory().getResaTopoDao().resaTopo(id);
    }

    @Override
    public String delReasaTopo(Integer id) {
        return getDaoFactory().getResaTopoDao().delResaTopo(id);
    }
}
