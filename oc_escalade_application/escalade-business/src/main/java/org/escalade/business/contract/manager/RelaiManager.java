package org.escalade.business.contract.manager;

import org.escalade.model.bean.Relai;

import java.util.List;

public interface RelaiManager {

    List<Relai> relais(Integer voie_id);

    String addRelai(Relai relai);

    Relai relai(Integer id);

    String delRelai(Integer id);

    String upRelai(Integer id, Relai relai);
}
