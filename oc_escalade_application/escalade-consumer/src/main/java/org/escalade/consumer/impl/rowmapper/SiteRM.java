package org.escalade.consumer.impl.rowmapper;

import org.escalade.model.bean.Site;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SiteRM {


    public RowMapper<Site> getvSiteRowMapper() {
        return vSiteRowMapper;
    }

    private RowMapper<Site> vSiteRowMapper = new RowMapper<Site>() {
        @Override
        public Site mapRow(ResultSet pRs, int rowNum) throws SQLException {
            Site vSite = new Site();
            vSite.setId(pRs.getInt("id"));
            vSite.setNom(pRs.getString("nom"));
            vSite.setRegion(pRs.getString("region"));
            vSite.setDescription(pRs.getString("description"));
            return vSite;
        }
    };
}
