package org.escalade.business.contract.manager;

import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Messagerie;
import org.escalade.model.bean.ResaTopo;

import java.util.List;

public interface MessagerieManager {

    void addMessage (Messagerie message, Compte compte);

}
