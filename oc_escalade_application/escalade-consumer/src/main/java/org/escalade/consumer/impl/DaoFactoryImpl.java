package org.escalade.consumer.impl;

import org.escalade.consumer.contract.DaoFactory;
import org.escalade.consumer.contract.dao.*;

public class DaoFactoryImpl implements DaoFactory {

    private CommentaireDao commentaireDao;
    private CompteDao compteDao;
    private LongueurDao longueurDao;
    private ResaTopoDao resaTopoDao;
    private SecteurDao secteurDao;
    private SiteDao siteDao;
    private TopoDao topoDao;
    private VoieDao voieDao;

    @Override
    public CommentaireDao getCommentaireDao() {
        return commentaireDao;
    }

    @Override
    public void setCommentaireDao(CommentaireDao commentaireDao) {
        this.commentaireDao = commentaireDao;
    }

    @Override
    public CompteDao getCompteDao() {
        return compteDao;
    }

    @Override
    public void setCompteDao(CompteDao compteDao) {
        this.compteDao = compteDao;
    }

    @Override
    public LongueurDao getLongueurDao() {
        return longueurDao;
    }

    @Override
    public void setLongueurDao(LongueurDao longueurDao) {
        this.longueurDao = longueurDao;
    }

    @Override
    public ResaTopoDao getResaTopoDao() {
        return resaTopoDao;
    }

    @Override
    public void setResaTopoDao(ResaTopoDao resaTopoDao) {
        this.resaTopoDao = resaTopoDao;
    }

    @Override
    public SecteurDao getSecteurDao() {
        return secteurDao;
    }

    @Override
    public void setSecteurDao(SecteurDao secteurDao) {
        this.secteurDao = secteurDao;
    }

    @Override
    public SiteDao getSiteDao() {
        return siteDao;
    }

    @Override
    public void setSiteDao(SiteDao siteDao) {
        this.siteDao = siteDao;
    }

    @Override
    public TopoDao getTopoDao() {
        return topoDao;
    }

    @Override
    public void setTopoDao(TopoDao topoDao) {
        this.topoDao = topoDao;
    }

    @Override
    public VoieDao getVoieDao() {
        return voieDao;
    }

    @Override
    public void setVoieDao(VoieDao voieDao) {
        this.voieDao = voieDao;
    }
}
