package com.designpattern.structural.adapterpattern;

public class AdapterDesignPatternTest {
    public static void main(String[] args) {
        Chargeable appleCharger = new AppleCharger();
        appleCharger.setMobileName("iPhone 13");
        ChargerUtil.doCharge(appleCharger);

        Charger samsuCharger = new SamsungCharger();
        samsuCharger.setMobileName("Samsung M30F");

        AppleAdapter adapter = new AppleAdapter();
        adapter.setSamsungCharger(samsuCharger);
        ChargerUtil.doCharge(adapter);
    }
}
