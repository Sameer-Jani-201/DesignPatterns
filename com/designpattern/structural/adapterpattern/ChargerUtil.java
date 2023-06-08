package com.designpattern.structural.adapterpattern;

public class ChargerUtil {
    public static void doCharge(Chargeable chargeable){
        chargeable.charge();
    }
}
