package com.example.seismerecords.dtos.localisationDTOs;

import com.example.seismerecords.entities.Seisme;

import java.util.List;

public class LocalisationSaveDTO {

    private String pays;
    private String code;
    private List<Seisme> seismes;

    public LocalisationSaveDTO() {
    }

    public LocalisationSaveDTO(String pays, String code, List<Seisme> seismes) {
        this.pays = pays;
        this.code = code;
        this.seismes = seismes;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Seisme> getSeismes() {
        return seismes;
    }

    public void setSeismes(List<Seisme> seismes) {
        this.seismes = seismes;
    }
}
