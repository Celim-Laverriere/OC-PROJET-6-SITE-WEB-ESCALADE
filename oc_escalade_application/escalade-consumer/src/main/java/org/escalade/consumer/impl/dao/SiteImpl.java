package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.SiteDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.SiteRM;
import org.escalade.model.bean.Site;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;


public class SiteImpl extends AbstractDataImpl implements SiteDao {

    @Override
    public List<Site> sites() {
        String vSql = "SELECT * FROM public.site";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM siteRM = new SiteRM();

        List<Site> vListSite = vJdbcTemplate.query(vSql, siteRM.getvSiteRowMapper());
        return vListSite;
    }

    @Override
    public String addSite(Site site) {
        return null;
    }

    @Override
    public Site site(Integer id) {

        String vSql = "SELECT * FROM public.site"
                    + " WHERE id = " + id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM siteRM = new SiteRM();

        List<Site> vSiteDetail = vJdbcTemplate.query(vSql, siteRM.getvSiteRowMapper());
        return  vSiteDetail.get(0);
    }

    @Override
    public String delSite(Integer id) {
        return null;
    }

    @Override
    public String upSite(Integer id, Site site) {
        return null;
    }
}
