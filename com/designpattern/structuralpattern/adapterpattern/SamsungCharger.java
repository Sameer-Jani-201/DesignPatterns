package com.designpattern.structuralpattern.adapterpattern;

public class SamsungCharger implements Charger{

    private String mobileName;

    @Override
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    // The only difference is with interface method name.
    @Override
    public void supplyCharge() {
        System.out.println("Charging "+this.mobileName+" ...");
    }
    
}
