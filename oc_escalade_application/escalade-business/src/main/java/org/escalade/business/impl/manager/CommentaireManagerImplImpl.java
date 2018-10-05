package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.CommentaireManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Commentaire;

import java.util.List;

public class CommentaireManagerImplImpl extends AbstractManagerImpl implements CommentaireManager {

    @Override
    public List<Commentaire> commentaires() {
        return getDaoFactory().getCommentaireDao().commentaires();
    }

    @Override
    public String addCommentaire(Commentaire commentaire) {
        return getDaoFactory().getCommentaireDao().addCommentaire(commentaire);
    }

    @Override
    public Commentaire commentaire(Integer id) {
        return getDaoFactory().getCommentaireDao().commentaire(id);
    }

    @Override
    public String delCommentaire(Integer id) {
        return getDaoFactory().getCommentaireDao().delCommentaire(id);
    }
}
