package com.example.seismerecords.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Localisation {

    @Id
    private String id;
    private String pays;
    private String code;
    @DBRef
    private List<Seisme> seismes;

    public Localisation() {
    }

    public Localisation(String id, String pays, String code, List<Seisme> seismes) {
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
