package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.SiteDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.SiteRM;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
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
    public void addSite(Site site, Compte compte) {

        String vSql = "INSERT INTO public.site (compte_id, nom, region, description) VALUES"
                    + " (:compte_id, :nom, :region, :description)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("compte_id", compte.getId());
        vParams.addValue("nom", site.getNom());
        vParams.addValue("region", site.getRegion());
        vParams.addValue("description", site.getDescription());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        int vNbrLigneMaj = vJdbcTemplate.update(vSql, vParams);
    }

    @Override
    public Site site(Integer id) {

        String vSql = "SELECT * FROM public.site"
                    + " WHERE id = " + id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM vSiteRM = new SiteRM();

        List<Site> vSiteDetail = vJdbcTemplate.query(vSql, vSiteRM.getvSiteRowMapper());
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

    public List<Site> sitesBySite(Site regionSelect, String typeVoieSelect, String cotationVoieSelect){

        String vSql = "SELECT * FROM public.site"
                    + " WHERE region = " + "'" + regionSelect.getRegion() + "'"
                    + " AND id = (SELECT site_id FROM public.secteur"
                    + " WHERE id = (SELECT secteur_id FROM public.voie "
                    + " WHERE type_voie = " + "'" + typeVoieSelect + "'"
                    + " AND cotation = " + "'" + cotationVoieSelect + "'))";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM vSiteRM = new SiteRM();

        List<Site> vListSites = vJdbcTemplate.query(vSql, vSiteRM.getvSiteRowMapper());

        return vListSites;
    }
}
