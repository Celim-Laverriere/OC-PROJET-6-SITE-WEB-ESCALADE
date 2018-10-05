package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.SiteDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SiteImpl extends AbstractDataImpl implements SiteDao {

    @Override
    public List<Site> sites() {
        String vSql = "SELECT * FROM public.site";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Site> vSiteRowMapper = new RowMapper<Site>() {
            public Site mapRow(ResultSet pRs, int pRowNum) throws SQLException {
                Site vSite = new Site();
                vSite.setId(pRs.getInt("id"));
                vSite.setNom(pRs.getString("nom"));
                vSite.setRegion(pRs.getString("region"));
                vSite.setDescription(pRs.getString("description"));
                return vSite;
            }
        };

        List<Site> vListSite = vJdbcTemplate.query(vSql, vSiteRowMapper);
        return vListSite;
    }

    @Override
    public String addSite(Site site) {
        return null;
    }

    @Override
    public Site site(Integer id) {
        return null;
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
