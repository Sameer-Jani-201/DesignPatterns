package com.designpattern.creational.abstractfactorypattern;
/*
 * This is Honda Car factory which produce Honda's different car object with help of createCar() method.
 */
public class HondaCarFactory implements CarFactory{
    
    @Override
    public Car createCar(String type) {
        if(type.equalsIgnoreCase("brio")){
            return new Brio();
        }
        if(type.equalsIgnoreCase("city")){
            return new City();
        }
        return null;
    }
}
