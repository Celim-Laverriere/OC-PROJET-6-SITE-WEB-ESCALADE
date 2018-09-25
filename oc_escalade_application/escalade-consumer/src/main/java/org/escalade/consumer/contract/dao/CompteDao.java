package org.escalade.consumer.contract.dao;

import org.escalade.model.bean.Compte;
import java.util.List;

public interface CompteDao {

    /**
     * Renvoie le/les compte(s) demandé(s)
     *
     * @return Le {@link Compte}
     */
    List <Compte> getRead();

    /**
     * Créé un compte
     *
     */
    List <Compte> setCreate();


}
