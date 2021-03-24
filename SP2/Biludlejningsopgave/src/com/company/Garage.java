package com.company;

import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> bilpark = new ArrayList<Bil>();



    public void addBil(Bil bil){
    bilpark.add(bil);
}

    public double beregnGroenAfgiftForBilpark(){
        double samletAfgift = 0;

        for(int i = 0; i < bilpark.size(); i++){
            samletAfgift += bilpark.get(i).beregnGroenEjerafgift();
        }
        return samletAfgift;
    }

}