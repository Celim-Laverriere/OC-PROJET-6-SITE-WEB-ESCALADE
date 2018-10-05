package org.escalade.model.bean;

import java.util.Date;
import java.util.List;

public class Topo {

    private String nom;
    private Date date_upload;
    private String description;
    private String statut;
    private List<Commentaire> commentaires;
    private List<ResaTopo> resaTopos;

    public Topo() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_upload() {
        return date_upload;
    }

    public void setDate_upload(Date date_upload) {
        this.date_upload = date_upload;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public List<ResaTopo> getResaTopos() {
        return resaTopos;
    }

    public void setResaTopos(List<ResaTopo> resaTopos) {
        this.resaTopos = resaTopos;
    }
}
