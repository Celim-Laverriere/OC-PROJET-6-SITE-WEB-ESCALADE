package org.escalade.model.bean;

import java.util.Date;

public class ResaTopo {

    private Integer id;
    private Date date_debut;
    private Date date_fin;
    private Integer compte_id;

    public ResaTopo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Integer getCompte_id() {
        return compte_id;
    }

    public void setCompte_id(Integer compte_id) {
        this.compte_id = compte_id;
    }
}
