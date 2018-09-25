package org.escalade.consumer.impl.dao;

import org.escalade.consumer.contract.dao.CommentaireDao;
import org.escalade.consumer.impl.data.AbstractDaoDataImpl;
import org.escalade.model.bean.Commentaire;

import java.util.List;

public class CommentaireDaoImpl extends AbstractDaoDataImpl implements CommentaireDao {

    @Override
    public List<Commentaire> getRead() {
        return null;
    }

    @Override
    public List<Commentaire> setCreate() {
        return null;
    }
}
