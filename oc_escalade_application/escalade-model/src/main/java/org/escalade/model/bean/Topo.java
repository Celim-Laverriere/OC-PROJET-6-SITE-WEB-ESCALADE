package org.escalade.model.bean;

import java.util.Date;
import java.util.List;

public class Topo {

    private Integer id;
    private String nom;
    private Date date_upload;
    private String description;
    private String url_topo;
    private List<Commentaire> commentaires;
    private List<ResaTopo> resaTopos;

    public Topo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getUrl_topo() {
        return url_topo;
    }

    public void setUrl_topo(String url_topo) {
        this.url_topo = url_topo;
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
