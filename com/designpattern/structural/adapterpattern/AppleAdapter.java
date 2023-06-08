package com.designpattern.structural.adapterpattern;

public class AppleAdapter implements Chargeable{

    private Charger samsungCharger;

    

    @Override
    public void setMobileName(String mobileName) {
        // Keep this empty.
    }

    /*
     * When apple call charge method.
     * It internally calls supplyCharge method of samsung charger.
     */
    @Override
    public void charge() {
        samsungCharger.supplyCharge();
    }

    public void setSamsungCharger(Charger samsungCharger) {
        this.samsungCharger = samsungCharger;
    }
    
}
