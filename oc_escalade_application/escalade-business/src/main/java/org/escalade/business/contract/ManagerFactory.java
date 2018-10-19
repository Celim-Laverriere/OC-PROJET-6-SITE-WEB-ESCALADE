package org.escalade.business.contract;

import org.escalade.business.contract.manager.*;

public interface ManagerFactory {

    CommentaireManager getCommentaireManager();

    void setCommentaireManager(CommentaireManager commentaireManager);

    CompteManager getCompteManager();

    void setCompteManager(CompteManager compteManager);

    LongueurManager getLongueurManager();

    void setLongueurManager(LongueurManager longueurManager);

    RelaiManager getRelaiManager();

    void setRelaiManager(RelaiManager relaiManager);

    ResaTopoManager getResaTopoManager();

    void setResaTopoManager(ResaTopoManager resaTopoManager);

    SecteurManager getSecteurManager();

    void setSecteurManager(SecteurManager secteurManager);

    SiteManager getSiteManager();

    void setSiteManager(SiteManager siteManager);

    TopoManager getTopoManager();

    void setTopoManager(TopoManager topoManager);

    VoieManager getVoieManager();

    void setVoieManager(VoieManager voieManager);
}
