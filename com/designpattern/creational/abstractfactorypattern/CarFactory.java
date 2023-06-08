package com.designpattern.creational.abstractfactorypattern;
/*
 * This is Car Factory abstract type.
 */
public interface CarFactory {
    Car createCar(String type);
}
