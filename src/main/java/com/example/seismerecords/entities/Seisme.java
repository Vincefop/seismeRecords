package com.example.seismerecords.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Seisme {

    @Id
    private String id;
    private String nom;
    private float magnetude;
    @DBRef
    private Localisation localisation;
    private String date;

    public Seisme() {

    }

    public Seisme(String id, String nom, float magnetude, Localisation localisation, String date) {
        this.id = id;
        this.nom = nom;
        this.magnetude = magnetude;
        this.localisation = localisation;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
