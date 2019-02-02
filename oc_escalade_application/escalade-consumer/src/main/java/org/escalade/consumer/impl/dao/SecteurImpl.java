package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.SecteurDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.SecteurRM;
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

public class SecteurImpl extends AbstractDataImpl implements SecteurDao {

    @Override
    public List<Secteur> secteurs() {

        String vSql = "SELECT * FROM public.secteur";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SecteurRM vSecteurRM = new SecteurRM();

        List<Secteur> vListSecteur = vJdbcTemplate.query(vSql, vSecteurRM.getvSecteurRowMapper());
        return vListSecteur;
    }

    @Override
    public void addSecteur(Secteur secteur, Integer site_id) {

        String vSql = "INSERT INTO public.secteur (site_id, nom, description) VALUES"
                    + " (:site_id, :nom, :description)";

        MapSqlParameterSource vParams = new MapSqlParameterSource();
        vParams.addValue("site_id", site_id);
        vParams.addValue("nom", secteur.getNom());
        vParams.addValue("description", secteur.getDescription());

        NamedParameterJdbcTemplate vJdbcTemplate = new NamedParameterJdbcTemplate(getDataSource());

        int vNbrLigneMaj = vJdbcTemplate.update(vSql, vParams);
    }

    @Override
    public Secteur secteur(Integer id) {

        String vSql = "SELECT * FROM public.secteur "
                + " WHERE id = " + id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SecteurRM vSecteurRM = new SecteurRM();

        List<Secteur> vSecteurDetail = vJdbcTemplate.query(vSql, vSecteurRM.getvSecteurRowMapper());
        return  vSecteurDetail.get(0);
    }

    @Override
    public String delSecteur(Integer id) {
        return null;
    }

    @Override
    public String upSecteur(Integer id, Secteur secteur) {
        return null;
    }

    public List<Secteur> secteursBySiteId(Integer site_id){

        String vSql = "SELECT * FROM public.secteur "
                    + " WHERE site_id = " + site_id;

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SecteurRM vSecteurRM = new SecteurRM();

        List<Secteur> vListScteurs = vJdbcTemplate.query(vSql, vSecteurRM.getvSecteurRowMapper());
        return vListScteurs;
    }

    @Override
    public Secteur secteurByMotCleRecherche(String motCleRecherche) {
        String vSql = "SELECT * FROM public.secteur"
                    + " WHERE nom = " + "'" + motCleRecherche + "'";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SecteurRM vSecteurRM = new SecteurRM();

        List<Secteur> vSecteur = vJdbcTemplate.query(vSql, vSecteurRM.getvSecteurRowMapper());
        return vSecteur.get(0);
    }

    public List<Secteur> secteursParSessionDeCompteDao(Compte compte){

        String vSql = "SELECT secteur.* FROM public.secteur, public.site"
                    + " WHERE site_id = site.id"
                    + " AND site.id = " + compte.getId();

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        SecteurRM vSecteurRM = new SecteurRM();

        List<Secteur> vListSecteurs = vJdbcTemplate.query(vSql, vSecteurRM.getvSecteurRowMapper());
        return vListSecteurs;
    }
}
