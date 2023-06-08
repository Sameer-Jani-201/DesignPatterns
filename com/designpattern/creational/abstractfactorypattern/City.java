package com.designpattern.creational.abstractfactorypattern;

public class City implements Car{
    @Override
    public void drive() {
        System.out.println("Driving Honda city...");
    }
}
