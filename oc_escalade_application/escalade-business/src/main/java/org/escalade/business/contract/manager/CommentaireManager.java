package org.escalade.business.contract.manager;

import org.escalade.model.bean.Commentaire;

import java.util.List;

public interface CommentaireManager {
    
    List<Commentaire> commentaires();

    String addCommentaire(Commentaire commentaire);

    Commentaire commentaire(Integer id);

    String delCommentaire(Integer id);
}
