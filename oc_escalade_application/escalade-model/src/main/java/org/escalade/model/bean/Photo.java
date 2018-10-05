package org.escalade.model.bean;

import java.io.File;

public class Photo {

    private String nom;
    private File img;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public File getImg() {
        return img;
    }

    public void setImg(File img) {
        this.img = img;
    }
}
