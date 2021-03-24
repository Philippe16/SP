package com.company;

public class Elbil extends Bil{

    int batterikapacitetKWh;
    int maxKm;
    float whPrKm;


    public Elbil(String regNr, String maerke, String model, int aarGang, int antalDoere, int batterikapacitetKWh, int maxKm, float whPrKm) {
        super(regNr, maerke, model, aarGang, antalDoere);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }
    public double beregnGroenEjerafgift() {
        double kmPrl = 100/(whPrKm/91.25);

        if(kmPrl >= 20 && kmPrl < 50){
            kmPrl = 330;

        }else if(kmPrl >= 15 && kmPrl < 20){
            kmPrl = 1050;

        }else if(kmPrl >= 10 && kmPrl < 15){
            kmPrl = 2340;

        }else if(kmPrl >= 5 && kmPrl< 10){
            kmPrl = 5500;

        }else if(kmPrl < 5){
            kmPrl = 10470;
        }
        return kmPrl;
    }





    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterkapacitetKWh) {
        this.batterikapacitetKWh = batterkapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public float getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(float whPrKm) {
        this.whPrKm = whPrKm;
    }


    @Override
    public String toString(){
        return "\n" + "Reg. num: " + getRegNr() + "\nBrand: " + getMaerke() + "\nModel: " + getModel() + "\nYear:" + getAarGang() + "\nDoors:" + getAntalDoere() + "\nBatteryCapKWh:" + getBatterikapacitetKWh() + "\nMaxKm:" + getMaxKm() + "\nWhPrKm:" + getWhPrKm() + "\n";
    }

}
