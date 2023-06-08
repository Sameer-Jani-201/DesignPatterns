package com.designpattern.creational.abstractfactorypattern;
/*
 * This is Hyundai Car factory which produce Hyundai's different car object with help of createCar() method.
 */
public class HyundaiCarFactory implements CarFactory{
    @Override
    public Car createCar(String type) {
        if(type.equalsIgnoreCase("I10")){
            return new I10();
        }
        if(type.equalsIgnoreCase("i20")){
            return new I20();
        }
        return null;
    }
}
