package org.escalade.consumer.impl.data;

import org.escalade.model.bean.Secteur;

import javax.sql.DataSource;

public abstract  class AbstractDataImpl {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Secteur faireUneRechercheSimple(String motCleRecherche) {
        return null;
    }
}
