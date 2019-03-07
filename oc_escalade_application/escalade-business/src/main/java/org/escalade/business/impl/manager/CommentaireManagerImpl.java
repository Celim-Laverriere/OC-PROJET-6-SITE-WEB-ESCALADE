package org.escalade.business.impl.manager;

import org.escalade.business.contract.manager.CommentaireManager;
import org.escalade.business.impl.AbstractManagerImpl;
import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.Compte;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Topo;

import java.util.ArrayList;
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

    public List<Commentaire> commentairesByTopo(List<Topo> topoList){

        List<Commentaire> commentaireList = new ArrayList<>();

        for (Topo topo : topoList){
            /**@see org.escalade.consumer.impl.dao.CommentaireImpl#commentairesByTopoDao(Topo)*/
            List<Commentaire> commentaireListTemp = getDaoFactory().getCommentaireDao().commentairesByTopoDao(topo);
            commentaireList.addAll(commentaireListTemp);
        }

        return commentaireList;
    }
}
