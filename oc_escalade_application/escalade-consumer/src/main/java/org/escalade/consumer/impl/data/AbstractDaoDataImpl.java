package org.escalade.consumer.impl.data;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

public class AbstractDaoDataImpl {

   // @Inject
    //@Named("dataSourceTicket")
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }
}
