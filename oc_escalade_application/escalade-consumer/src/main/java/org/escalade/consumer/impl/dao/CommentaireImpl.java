package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.CommentaireDao;
import org.escalade.consumer.impl.data.AbstractDataImpl;
import org.escalade.model.bean.Commentaire;

import java.util.List;

public class CommentaireImpl extends AbstractDataImpl implements CommentaireDao {

    @Override
    public List<Commentaire> commentaires() {
        return null;
    }

    @Override
    public String addCommentaire(Commentaire commentaire) {
        return null;
    }

    @Override
    public Commentaire commentaire(Integer id) {
        return null;
    }

    @Override
    public String delCommentaire(Integer id) {
        return null;
    }
}
