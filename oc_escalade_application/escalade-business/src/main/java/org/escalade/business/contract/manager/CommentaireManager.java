package org.escalade.business.contract.manager;

import org.escalade.model.bean.Commentaire;
import org.escalade.model.bean.Site;
import org.escalade.model.bean.Topo;

import java.util.List;

public interface CommentaireManager {
    
    List<Commentaire> commentaires(Integer site_id, Integer topo_id);

    String addCommentaire(Commentaire commentaire);

    Commentaire commentaire(Integer site_id, Integer topo_id);

    String delCommentaire(Integer id);

    List<Commentaire> commentairesByTopo(List<Topo> topoList);
}
