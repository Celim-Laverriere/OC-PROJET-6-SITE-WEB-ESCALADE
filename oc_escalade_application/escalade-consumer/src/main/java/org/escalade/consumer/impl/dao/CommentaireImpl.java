package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.CommentaireDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.consumer.impl.rowmapper.CommentaireRM;
import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Topo;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class CommentaireImpl extends AbstractDataImpl implements CommentaireDao {

    @Override
    public List<Commentaire> commentaires(Integer site_id, Integer topo_id) {

        String vSql = null;

        if (site_id != null){
            vSql
                    = " SELECT * FROM public.commentaire"
                    + " WHERE site_id = " + site_id;
        }

        if (topo_id != null){
            vSql
                    = "SELECT * FROM public.commentaire"
                    + " WHERE topo_id = " + topo_id;
        }

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        CommentaireRM commentaireRM = new CommentaireRM();

        List<Commentaire> vListCommentaire = vJdbcTemplate.query(vSql, commentaireRM.getvCommentaireRowMapper());
        return vListCommentaire;
    }

    @Override
    public String addCommentaire(Commentaire commentaire) {
        return null;
    }

    @Override
    public Commentaire commentaire(Integer site_id, Integer topo_id) {
        String vSql = null;

        if (site_id != null){
            vSql
                    = " SELECT * FROM public.commentaire"
                    + " WHERE site_id = " + site_id;
        }

        if (topo_id != null){
            vSql
                    = "SELECT * FROM public.commentaire"
                    + " WHERE topo_id = " + topo_id;
        }

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        CommentaireRM commentaireRM = new CommentaireRM();

        List<Commentaire> vListCommentaire = vJdbcTemplate.query(vSql, commentaireRM.getvCommentaireRowMapper());
        return vListCommentaire.get(0);
    }

    @Override
    public String delCommentaire(Integer id) {
        return null;
    }

    public List<Commentaire> commentairesByTopoDao(Topo topo){

        String vSql = "SELECT * FROM public.commentaire"
                    + " WHERE topo_id = " + topo.getId();

        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        CommentaireRM vCommentaireRM = new CommentaireRM();

        List<Commentaire> commentaireList = vJdbcTemplate.query(vSql, vCommentaireRM.getvCommentaireRowMapper());
        return commentaireList;
    }
}
