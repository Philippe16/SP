package com.company;

public class Benzinbil extends Bil{
    float oktantal;
    float kmPrl;

    public Benzinbil(String regNr, String maerke, String model, int aarGang, int antalDoere, int oktantal, float kmPrl) {
        super(regNr, maerke, model, aarGang, antalDoere);
        this.oktantal = oktantal;
        this.kmPrl = kmPrl;
    }

    public double beregnGroenEjerafgift() {
        double groenEjerafgift = 0;

        if(kmPrl >= 20 && kmPrl < 50){
            groenEjerafgift = 330;

        }else if(kmPrl >= 15 && kmPrl < 20){
            groenEjerafgift = 1050;

        }else if(kmPrl >= 10 && kmPrl < 15){
            groenEjerafgift = 2340;

        }else if(kmPrl >= 5 && kmPrl< 10){
            groenEjerafgift = 5500;

        }else if(kmPrl < 5){
            groenEjerafgift = 10470;
        }
        return groenEjerafgift;
    }


    public float getOktantal() {
        return oktantal;
    }

    public void setOktantal(float oktantal) {
        this.oktantal = oktantal;
    }

    public float getKmPrl() {
        return kmPrl;
    }

    public void setKmPrl(float kmPrl) {
        this.kmPrl = kmPrl;
    }

    @Override
    public String toString(){
        return "\n" + "Reg. num: " + getRegNr() + "\nBrand: " + getMaerke() + "\nModel: " + getModel() + "\nYear:" + getAarGang() + "\nDoors:" + getAntalDoere() + "\nOctane rating:" + getOktantal() + "\nKm/l:" + getKmPrl()+ "\n" ;
    }




}
