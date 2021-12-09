package com.example.seismerecords.dtos.seismeDTOs;

import com.example.seismerecords.dtos.localisationDTOs.LocalisationDTO;
import com.example.seismerecords.dtos.localisationDTOs.LocalisationSaveDTO;


public class SeismeSaveDTO {
    private String nom;
    private float magnetude;
    private LocalisationSaveDTO localisationSaveDTO;
    private String date;

    public SeismeSaveDTO() {

    }

    public SeismeSaveDTO( String nom, float magnetude, LocalisationSaveDTO localisationSaveDTO, String date) {

        this.nom = nom;
        this.magnetude = magnetude;
        this.localisationSaveDTO = localisationSaveDTO;
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

    public LocalisationSaveDTO getLocalisationSaveDTO() {
        return localisationSaveDTO;
    }

    public void setLocalisation(LocalisationSaveDTO localisationDTO) {
        this.localisationSaveDTO = localisationDTO;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
