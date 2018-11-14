package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.CommentaireManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.Site;

import java.util.List;

public class CommentaireManagerImpl extends AbstractManagerImpl implements CommentaireManager {

    @Override
    public List<Commentaire> commentaires(Integer site_id, Integer topo_id) {
        return getDaoFactory().getCommentaireDao().commentaires(site_id, topo_id);
    }

    @Override
    public String addCommentaire(Commentaire commentaire) {
        return getDaoFactory().getCommentaireDao().addCommentaire(commentaire);
    }

    @Override
    public Commentaire commentaire(Integer site_id, Integer topo_id) {
        return getDaoFactory().getCommentaireDao().commentaire(site_id, topo_id);
    }

    @Override
    public String delCommentaire(Integer id) {
        return getDaoFactory().getCommentaireDao().delCommentaire(id);
    }
}
