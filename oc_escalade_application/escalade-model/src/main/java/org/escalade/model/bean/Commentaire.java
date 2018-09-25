package org.escalade.model.bean;


public class Commentaire {

    private Integer id;
    private String commentaire;

    public Commentaire() {
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
