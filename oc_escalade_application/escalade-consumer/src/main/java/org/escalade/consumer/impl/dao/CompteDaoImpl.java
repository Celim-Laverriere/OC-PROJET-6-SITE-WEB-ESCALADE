package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.CompteDao;
import org.escalade.consumer.impl.data.AbstractDaoDataImpl;
import org.escalade.model.bean.Compte;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CompteDaoImpl extends AbstractDaoDataImpl implements CompteDao {

    @Override
    public List<Compte> getRead() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        List listCompte = vJdbcTemplate.queryForList("SELECT COUNT (*) FROM public.compte", List.class);
        return listCompte;
    }

    @Override
    public List<Compte> setCreate() {
        return null;
    }
}
