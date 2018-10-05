package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.SiteManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Site;

import java.util.List;

public class SiteManagerImplImpl extends AbstractManagerImpl implements SiteManager {

    @Override
    public List<Site> sites() {
        return getDaoFactory().getSiteDao().sites();
    }

    @Override
    public String addSite(Site site) {
        return getDaoFactory().getSiteDao().addSite(site);
    }

    @Override
    public Site site(Integer id){
        return getDaoFactory().getSiteDao().site(id);
    }

    @Override
    public String delSite(Integer id) {
        return getDaoFactory().getSiteDao().delSite(id);
    }

    @Override
    public String upSite(Integer id, Site site) {
        return getDaoFactory().getSiteDao().upSite(id, site);
    }
}
