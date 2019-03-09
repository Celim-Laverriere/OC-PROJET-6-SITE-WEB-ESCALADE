package org.escalade.business.contract.manager;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.ResaTopo;

import java.util.List;

public interface ResaTopoManager {

    List<ResaTopo> resaTopos(Integer topo_id, Integer compte_id);

    ResaTopo addResaTopo(ResaTopo resaTopo, Compte compte);

    ResaTopo resaTopo(Integer compte_id, Integer topo_id);

    String delReasaTopo(Integer id);

    List<ResaTopo> resaTopoListByTopoAccount(Compte compte);

    List<ResaTopo> resaTopoListByAccount(Compte compte);
}
