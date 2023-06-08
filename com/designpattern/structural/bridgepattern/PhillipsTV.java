package com.designpattern.structural.bridgepattern;

public class PhillipsTV extends TV{

    Remote remoteType;

    PhillipsTV(Remote r){
        this.remoteType = r;
    }

    @Override
    void on() {
        System.out.println("Phillips TV ON: ");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Phillips TV OFF: ");
        remoteType.off();
    }
}
