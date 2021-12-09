package com.example.seismerecords.dtos.localisationDTOs;

import com.example.seismerecords.entities.Seisme;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

public class LocalisationDTO {

    private String id;
    private String pays;
    private String code;
    private List<Seisme> seismes;

    public LocalisationDTO() {
    }

    public LocalisationDTO(String id, String pays, String code, List<Seisme> seismes) {
        this.id = id;
        this.pays = pays;
        this.code = code;
        this.seismes = seismes;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
