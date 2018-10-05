package org.escalade.business.impl;

import org.escalade.consumer.contract.DaoFactory;
import org.springframework.transaction.PlatformTransactionManager;

import javax.inject.Inject;
import javax.inject.Named;

public abstract class AbstractManagerImpl {

    @Inject
    @Named("txManagerEscalade")
    private PlatformTransactionManager platformTransactionManager;

    public PlatformTransactionManager getPlatformTransactionManager() {
        return platformTransactionManager;
    }

    private DaoFactory daoFactory;

    public DaoFactory getDaoFactory() {
        return daoFactory;
    }

}
