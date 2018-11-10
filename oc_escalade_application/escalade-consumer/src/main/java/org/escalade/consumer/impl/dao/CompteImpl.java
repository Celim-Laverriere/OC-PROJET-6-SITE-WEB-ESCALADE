package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.CompteDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.CompteRM;
import org.escalade.model.bean.Compte;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CompteImpl extends AbstractDataImpl implements CompteDao {

    @Override
    public List<Compte> comptes() {

        String vSql = "SELECT * FROM public.compte";

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        CompteRM compteRM = new CompteRM();


        List<Compte> vListeCompte = vJdbcTemplate.query(vSql, compteRM.getvCompteRowMapper());
        return vListeCompte;
    }

    @Override
    public String addCompte(Compte compte) {
        return null;
    }

    @Override
    public Compte compte(Integer id) {
        return null;
    }

    @Override
    public String delCompte(Integer id) {
        return null;
    }

    @Override
    public String upCompte(Integer id, Compte compte) {
        return null;
    }
}
