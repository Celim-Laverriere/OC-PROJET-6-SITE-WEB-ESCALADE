package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.SiteDao;
import org.escalade.consumer.impl.data.AbstractDaoDataImpl;
import org.escalade.model.bean.Site;

import java.util.List;

public class SiteDaoImpl extends AbstractDaoDataImpl implements SiteDao {

    @Override
    public List<Site> getRead() {
        return null;
    }

    @Override
    public List<Site> setCreate() {
        return null;
    }
}
