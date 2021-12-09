package com.example.seismerecords.dtos;

import com.example.seismerecords.entities.Localisation;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

public class SeismeDTO {
    private String id;
    private String nom;
    private float magnetude;
    private Localisation localisation;
    private Date date;

    public SeismeDTO() {

    }

    public SeismeDTO(String id, String nom, float magnetude, Localisation localisation, Date date) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
