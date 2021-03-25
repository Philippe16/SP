package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        Benzinbil bil1 = new Benzinbil("AT83651", "Mercedes", "S Klasse", 2020, 4, 100, 22.7f);
        Elbil bil2 = new Elbil("TeslaLover45", "Tesla", "S", 2019, 4, 100, 560, 95.0f);
        Diselbil bil3 = new Diselbil("FC80518", "Mazda", "Mazda 6", 2018, 4,true, 15.6f);
        garage.addBil(bil1);
        garage.addBil(bil2);
        garage.addBil(bil3);

        System.out.println(garage.bilpark);
        System.out.println("Total green property tax:" + garage.beregnGroenAfgiftForBilpark());
        }
}
