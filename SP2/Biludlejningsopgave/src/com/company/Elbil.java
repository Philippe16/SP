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
    public double beregnGroenEjerafgift(){
      double groenEjerafgift = 0;
      double kmPrL = 100 / (whPrKm / 91.25);

      if(kmPrL >= 20 && kmPrL < 50 || kmPrL > 50){
         groenEjerafgift = 330;
      }else if(kmPrL >= 15 && kmPrL < 20){
         groenEjerafgift = 1050;
      }else if(kmPrL >= 10 && kmPrL < 15){
         groenEjerafgift = 2340;
      }else if(kmPrL >= 5 && kmPrL < 10){
         groenEjerafgift = 5500;
      }else if(kmPrL < 5){
         groenEjerafgift = 10470;
      }

      return groenEjerafgift ;
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
