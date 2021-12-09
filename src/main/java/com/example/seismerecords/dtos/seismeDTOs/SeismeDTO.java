package com.example.seismerecords.dtos.seismeDTOs;

import com.example.seismerecords.dtos.localisationDTOs.LocalisationDTO;


public class SeismeDTO {
    private String id;
    private String nom;
    private float magnetude;
    private LocalisationDTO localisationDTO;
    private String date;

    public SeismeDTO() {

    }

    public SeismeDTO(String id, String nom, float magnetude, LocalisationDTO localisationDTO, String date) {
        this.id = id;
        this.nom = nom;
        this.magnetude = magnetude;
        this.localisationDTO = localisationDTO;
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

    public LocalisationDTO getLocalisationDTO() {
        return localisationDTO;
    }

    public void setLocalisation(LocalisationDTO localisationDTO) {
        this.localisationDTO = localisationDTO;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
