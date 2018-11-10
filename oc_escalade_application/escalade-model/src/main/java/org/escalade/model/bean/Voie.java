package org.escalade.model.bean;

import java.util.List;

public class Voie {

    private Integer id;
    private String nom;
    private String type;
    private String cotation;
    private float hauteur;
    private Integer secteur_id;
    private List<Longueur> longueurs;
    private List<Relai> relais;

    public Voie() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public Integer getSecteur_id() {
        return secteur_id;
    }

    public void setSecteur_id(Integer secteur_id) {
        this.secteur_id = secteur_id;
    }

    public List<Longueur> getLongueurs() {
        return longueurs;
    }

    public void setLongueurs(List<Longueur> longueurs) {
        this.longueurs = longueurs;
    }

    public List<Relai> getRelais() {
        return relais;
    }

    public void setRelais(List<Relai> relais) {
        this.relais = relais;
    }
}
