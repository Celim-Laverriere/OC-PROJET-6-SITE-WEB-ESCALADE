package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.TopoManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.ResaTopo;
import org.escalade.model.bean.Topo;

import java.util.List;

public class TopoManagerImpl extends AbstractManagerImpl implements TopoManager {

    @Override
    public List<Topo> topos() {
        return getDaoFactory().getTopoDao().topos();
    }

    @Override
    public String addTopo(Topo topo) {
        return getDaoFactory().getTopoDao().addTopo(topo);
    }

    @Override
    public Topo topo(Integer topo_id) {

        Topo topo = getDaoFactory().getTopoDao().topo(topo_id);

        List<Commentaire> commentaires = getDaoFactory().getCommentaireDao().commentaires(null, topo.getId());
        topo.setCommentaires(commentaires);

        List<ResaTopo> resaTopos = getDaoFactory().getResaTopoDao().resaTopos(null, topo.getId());
        topo.setResaTopos(resaTopos);


        return topo;
    }

    @Override
    public String delTopo(Integer id) {
        return getDaoFactory().getTopoDao().delTopo(id);
    }

    @Override
    public String upTopo(Integer id, Topo topo) {
        return getDaoFactory().getTopoDao().upTopo(id, topo);
    }
}
