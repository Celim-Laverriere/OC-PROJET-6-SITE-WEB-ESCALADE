package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.SiteDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.SiteRM;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Secteur;
import org.escalade.model.bean.Site;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.sql.ResultSet;
import java.sql.SQLException;
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

        vJdbcTemplate.update(vSql, vParams);
    }

    @Override
    public Site site(Integer site_id) {

        String vSql = "SELECT * FROM public.site"
                    + " WHERE id = " + site_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM vSiteRM = new SiteRM();

        List<Site> vSiteDetail = vJdbcTemplate.query(vSql, vSiteRM.getvSiteRowMapper());
        return  vSiteDetail.get(0);
    }

    @Override
    public void delSite(Integer id) {

        String vSql = "DELETE FROM public.site WHERE id = :id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", id);

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrLigneMaj = vJdbcTemplate.update(vSql, vParams);
    }

    @Override
    public void upSite(Site site) {
        String vSql = "UPDATE public.site SET"
                    + " nom = :nom, region = :region, description = :description"
                    + " WHERE id = :id";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("id", site.getId());
        vParams.addValue("nom", site.getNom());
        vParams.addValue("region", site.getRegion());
        vParams.addValue("description", site.getDescription());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());
        int vNbrLigneMaj = vJdbcTemplate.update(vSql, vParams);
    }

    public List<Site> sitesByAdvancedSearchDao(String regionSelect, String typeVoieSelect, String cotationVoieSelect){

        String vSql = "SELECT distinct site.* FROM site "
                    + " INNER JOIN secteur ON site.id = secteur.site_id\n"
                    + " INNER JOIN voie ON secteur.id = voie.secteur_id\n"
                    + " WHERE voie.type_voie = "+ "'" + typeVoieSelect + "'"
                    + " AND voie.cotation = " + "'" + cotationVoieSelect + "'"
                    + " AND site.region = " + "'"+ regionSelect + "'";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM vSiteRM = new SiteRM();

        List<Site> vListSites = vJdbcTemplate.query(vSql, vSiteRM.getvSiteRowMapper());

        return vListSites;
    }

    public List<Site> siteByRegionDao(){

        String vSql = "SELECT DISTINCT region FROM public.site";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        RowMapper<Site> vSiteRowMapper = new RowMapper<Site>() {

            @Override
            public Site mapRow(ResultSet pRs, int rowNum) throws SQLException {
                Site vSite = new Site();
                vSite.setRegion(pRs.getString("region"));
                return vSite;
            }
        };

        List<Site> vListRegion = vJdbcTemplate.query(vSql, vSiteRowMapper);
        return vListRegion;
    }

    /**
     * Recherche dans la table "site" une correspondance
     * dans la colonne "nom" ou "region" avec la saissi de l'utilisateur.
     * @param motCleRecherche
     * @return vListSite
     */
    @Override
    public List<Site> rechercheSimpleParSiteDao(String motCleRecherche) {

        String vSql = "SELECT * FROM public.site"
                    + " WHERE CONCAT(nom, region) LIKE " + "'" + "%" + motCleRecherche + "%" + "'";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM vSiteRM = new SiteRM();

        List<Site> vListSite = vJdbcTemplate.query(vSql, vSiteRM.getvSiteRowMapper());
        return vListSite;
    }

    /**
     * Renvoie le site correspondant a site_id du secteur.
     *
     * @param site_id
     * @return sites
     */
    public List<Site> rechercheSiteParSecteur(Integer site_id){

        String vSql = "SELECT * FROM public.site"
                    + " WHERE id = " + site_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM vSiteRM = new SiteRM();

        List<Site> vListSites = vJdbcTemplate.query(vSql, vSiteRM.getvSiteRowMapper());
        return vListSites;
    }

    @Override
    public List<Site> sitesParSessionDeCompteDao(Compte compte) {

        String vSql = "SELECT * FROM public.site"
                    + " WHERE compte_id = " + compte.getId();

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SiteRM vSiteRM = new SiteRM();

        List<Site> vListSites = vJdbcTemplate.query(vSql, vSiteRM.getvSiteRowMapper());
        return vListSites;
    }

}
