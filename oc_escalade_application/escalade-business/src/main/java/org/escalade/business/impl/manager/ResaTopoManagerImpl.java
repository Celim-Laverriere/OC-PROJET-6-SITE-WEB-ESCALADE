package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.ResaTopoManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.ResaTopo;

import java.util.List;

public class ResaTopoManagerImpl extends AbstractManagerImpl implements ResaTopoManager {

    @Override
    public List<ResaTopo> resaTopos(Integer topo_id, Integer compte_id) {
        return getDaoFactory().getResaTopoDao().resaTopos(topo_id, compte_id);
    }

    @Override
    public String addResaTopo(ResaTopo resaTopo) {
        return getDaoFactory().getResaTopoDao().addResaTopo(resaTopo);
    }

    @Override
    public ResaTopo resaTopo(Integer compte_id, Integer topo_id) {
        return getDaoFactory().getResaTopoDao().resaTopo(compte_id, topo_id);
    }

    @Override
    public String delReasaTopo(Integer id) {
        return getDaoFactory().getResaTopoDao().delResaTopo(id);
    }
}
