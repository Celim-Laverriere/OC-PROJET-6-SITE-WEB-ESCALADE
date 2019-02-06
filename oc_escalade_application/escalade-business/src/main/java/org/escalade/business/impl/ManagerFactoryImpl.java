package org.escalade.business.impl;

import org.escalade.business.contract.ManagerFactory;
import org.escalade.business.contract.manager.*;

public class ManagerFactoryImpl implements ManagerFactory {

    private CommentaireManager commentaireManager;
    private CompteManager compteManager;
    private LongueurRelaiManager longueurRelaiManager;
    private ResaTopoManager resaTopoManager;
    private SecteurManager secteurManager;
    private SiteManager siteManager;
    private TopoManager topoManager;
    private VoieManager voieManager;

    @Override
    public CommentaireManager getCommentaireManager() {
        return commentaireManager;
    }

    @Override
    public void setCommentaireManager(CommentaireManager commentaireManager) {
        this.commentaireManager = commentaireManager;
    }

    @Override
    public CompteManager getCompteManager() {
        return compteManager;
    }

    @Override
    public void setCompteManager(CompteManager compteManager) {
        this.compteManager = compteManager;
    }

    @Override
    public LongueurRelaiManager getLongueurRelaiManager() {
        return longueurRelaiManager;
    }

    @Override
    public void setLongueurRelaiManager(LongueurRelaiManager longueurRelaiManager) {
        this.longueurRelaiManager = longueurRelaiManager;
    }

    @Override
    public ResaTopoManager getResaTopoManager() {
        return resaTopoManager;
    }

    @Override
    public void setResaTopoManager(ResaTopoManager resaTopoManager) {
        this.resaTopoManager = resaTopoManager;
    }

    @Override
    public SecteurManager getSecteurManager() {
        return secteurManager;
    }

    @Override
    public void setSecteurManager(SecteurManager secteurManager) {
        this.secteurManager = secteurManager;
    }

    @Override
    public SiteManager getSiteManager() {
        return siteManager;
    }

    @Override
    public void setSiteManager(SiteManager siteManager) {
        this.siteManager = siteManager;
    }

    @Override
    public TopoManager getTopoManager() {
        return topoManager;
    }

    @Override
    public void setTopoManager(TopoManager topoManager) {
        this.topoManager = topoManager;
    }

    @Override
    public VoieManager getVoieManager() {
        return voieManager;
    }

    @Override
    public void setVoieManager(VoieManager voieManager) {
        this.voieManager = voieManager;
    }
}
