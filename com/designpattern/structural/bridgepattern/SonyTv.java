package com.designpattern.structural.bridgepattern;

public class SonyTv extends TV{
    Remote remoteType;

    SonyTv(Remote r){
        this.remoteType = r;
    }

    @Override
    void on() {
        System.out.println("Sony TV ON: ");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Sony TV OFF: ");
        remoteType.off();
    }
}
