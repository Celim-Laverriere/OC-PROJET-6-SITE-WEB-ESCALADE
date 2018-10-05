package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.SecteurDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Secteur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SecteurImpl extends AbstractDataImpl implements SecteurDao {

    @Override
    public List<Secteur> secteurs(Integer siteId) {
        String vSql
                = "SELECT COUNT(*) FROM public.secteur"
                + "WHERE site_id = site_id";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Secteur> vSecteurRowMapper = new RowMapper<Secteur>() {
            @Override
            public Secteur mapRow(ResultSet pRs, int rowNum) throws SQLException {
                Secteur vSecteur = new Secteur();
                vSecteur.setId(pRs.getInt("id"));
                vSecteur.setNom(pRs.getString("nom"));
                vSecteur.setDescription(pRs.getString("description"));
                return vSecteur;
            }
        };

        List<Secteur> vListSecteur = vJdbcTemplate.query(vSql, vSecteurRowMapper);
        return vListSecteur;
    }

    @Override
    public String addSecteur(Secteur secteur) {
        return null;
    }

    @Override
    public Secteur secteur(Integer id) {
        return null;
    }

    @Override
    public String delSecteur(Integer id) {
        return null;
    }

    @Override
    public String upSecteur(Integer id, Secteur secteur) {
        return null;
    }
}
