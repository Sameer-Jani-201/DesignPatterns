package com.designpattern.structuralpattern.adapterpattern;

public class AppleCharger implements Chargeable{

    private String mobileName;

    @Override
    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    @Override
    public void charge() {
        System.out.println("Charging "+this.mobileName+" ...");
    }
    
}
