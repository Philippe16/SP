package com.company;

public class Diselbil extends Bil{

boolean harPartikelfilter;
float kmPrL;

    public Diselbil(String regNr, String maerke, String model, int aarGang, int antalDoere, boolean harPartikelfilter, float kmPrL) {
        super(regNr, maerke, model, aarGang, antalDoere);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public double beregnGroenEjerafgift() {
        double groenEjerafgift = 0;

        if (kmPrL >= 20 && kmPrL < 50) {
            groenEjerafgift = 330 + 130;

        } else if (kmPrL >= 15 && kmPrL < 20) {
            groenEjerafgift = 1050 + 1390;

        } else if (kmPrL >= 10 && kmPrL < 15) {
            groenEjerafgift = 2340 + 1850;

        } else if (kmPrL >= 5 && kmPrL < 10) {
            groenEjerafgift = 5500 + 2770;

        } else if (kmPrL < 5) {
            groenEjerafgift = 10470 + 15260;
        }

        if (!harPartikelfilter) {
            groenEjerafgift += 1000;
        }
        return groenEjerafgift;
    }



    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public float getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(float kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "\n" + "Reg. num: " + getRegNr() + "\nBrand: " + getMaerke() + "\nModel: " + getModel() + "\nYear:" + getAarGang() + "\nDoors:" + getAntalDoere() + "\nHas particulate filter:" + isHarPartikelfilter() + "\nKm/l:" + getKmPrL() + "\n";
    }

}
