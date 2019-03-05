package org.escalade.consumer.contract;

import org.escalade.consumer.contract.dao.*;

public interface DaoFactory {

    CommentaireDao getCommentaireDao();

    void setCommentaireDao(CommentaireDao commentaireDao);

    CompteDao getCompteDao();

    void setCompteDao(CompteDao compteDao);

    LongueurDao getLongueurDao();

    void setLongueurDao(LongueurDao longueurDao);

    ResaTopoDao getResaTopoDao();

    void setResaTopoDao(ResaTopoDao resaTopoDao);

    SecteurDao getSecteurDao();

    void setSecteurDao(SecteurDao secteurDao);

    SiteDao getSiteDao();

    void setSiteDao(SiteDao siteDao);

    TopoDao getTopoDao();

    void setTopoDao(TopoDao topoDao);

    VoieDao getVoieDao();

    void  setVoieDao(VoieDao voieDao);
}
