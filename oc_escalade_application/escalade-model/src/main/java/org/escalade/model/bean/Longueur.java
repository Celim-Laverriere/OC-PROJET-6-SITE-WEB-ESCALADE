package org.escalade.model.bean;

public class Longueur {

    private byte cotation;
    private float hauteur;
    private byte nb_point;

    public Longueur() {
    }

    public byte getCotation() {
        return cotation;
    }

    public void setCotation(byte cotation) {
        this.cotation = cotation;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(float hauteur) {
        this.hauteur = hauteur;
    }

    public byte getNb_point() {
        return nb_point;
    }

    public void setNb_point(byte nb_point) {
        this.nb_point = nb_point;
    }
}
