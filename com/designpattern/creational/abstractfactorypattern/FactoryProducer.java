package com.designpattern.creational.abstractfactorypattern;
/*
 * This class will produce Specific Car Factory objects such as hyundai & honda car factory.
 */
public class FactoryProducer {
    public static CarFactory getCarFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("hyundai")){
            return new HyundaiCarFactory();
        }
        if(factoryType.equalsIgnoreCase("honda")){
            return new HondaCarFactory();
        }
        return null;
    }
}
