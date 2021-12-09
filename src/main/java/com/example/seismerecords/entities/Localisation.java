package com.example.seismerecords.entities;

public class Localisation {

    private String pays;
    private String code;

    public Localisation() {
    }

    public Localisation(String pays, String code) {
        this.pays = pays;
        this.code = code;
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
}
