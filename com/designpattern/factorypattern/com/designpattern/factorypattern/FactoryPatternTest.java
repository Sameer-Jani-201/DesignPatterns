package com.designpattern.factorypattern;

public class FactoryPatternTest {
    public static void main(String[] args) {
        Animal dogAnimal = AnimalFactory.createAnimal(AnimalFactory.AnimalType.Dog);
        dogAnimal.eat();

        Animal catAnimal = AnimalFactory.createAnimal(AnimalFactory.AnimalType.Cat);
        catAnimal.eat();

        Animal foxAnimal = AnimalFactory.createAnimal(AnimalFactory.AnimalType.Fox);
        foxAnimal.eat();
    }
}
