package com.company;

public abstract class Bil {
    String regNr;
    String maerke;
    String model;
    int aarGang;
    int antalDoere;

    public Bil(String regNr, String maerke, String model, int aarGang, int antalDoere) {
        this.regNr = regNr;
        this.maerke = maerke;
        this.model = model;
        this.aarGang = aarGang;
        this.antalDoere = antalDoere;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getMaerke() {
        return maerke;
    }

    public void setMaerke(String maerke) {
        this.maerke = maerke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAarGang() {
        return aarGang;
    }

    public void setAarGang(int aarGang) {
        this.aarGang = aarGang;
    }

    public int getAntalDoere() {
        return antalDoere;
    }

    public void setAntalDoere(int antalDoere) {
        this.antalDoere = antalDoere;
    }

    public abstract double beregnGroenEjerafgift();


}
