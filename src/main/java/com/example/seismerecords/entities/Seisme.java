package com.example.seismerecords.entities;

import java.util.Date;

public class Seisme {

    private String nom;
    private float magnetude;
    private Localisation localisation;
    private Date date;

    public Seisme() {

    }

    public Seisme(String nom, float magnetude, Localisation localisation, Date date) {
        this.nom = nom;
        this.magnetude = magnetude;
        this.localisation = localisation;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getMagnetude() {
        return magnetude;
    }

    public void setMagnetude(float magnetude) {
        this.magnetude = magnetude;
    }

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
