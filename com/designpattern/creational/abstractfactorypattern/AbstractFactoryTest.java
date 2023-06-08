package com.designpattern.creational.abstractfactorypattern;

/*
 * This is abstract factory pattern test class.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CarFactory hondCarFactory = FactoryProducer.getCarFactory("honda");
        Car city=hondCarFactory.createCar("city");
        city.drive();

        Car brio = hondCarFactory.createCar("brio");
        brio.drive();

        CarFactory hyndaiCarFactory = FactoryProducer.getCarFactory("hyundai");
        Car i10 = hyndaiCarFactory.createCar("i10");
        i10.drive();

        Car i20 = hyndaiCarFactory.createCar("i20");
        i20.drive();
    }
}
