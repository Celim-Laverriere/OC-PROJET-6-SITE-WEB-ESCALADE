package org.escalade.business.contract.manager;

import org.escalade.model.bean.ResaTopo;

import java.util.List;

public interface ResaTopoManager {

    List<ResaTopo> resaTopos();

    String addResaTopo(ResaTopo resaTopo);

    ResaTopo resaTopo(Integer id);

    String delReasaTopo(Integer id);
}
