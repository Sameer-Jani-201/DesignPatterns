package com.designpattern.factorypattern;

/*
 * This is Animal Factory class which produces Animals,
 * such as Cat, Dog, Fox..., etc
 */
public class AnimalFactory {

    public static Animal createAnimal(AnimalType type){
        if(type == null) return null;
        if(type == AnimalType.Dog){
            return new Dog();
        }else if(type == AnimalType.Cat){
            return new Cat();
        }else if(type == AnimalType.Fox){
            return new Fox();
        }
        return null;
    }

    static enum AnimalType{
        Dog,
        Cat,
        Fox;
    }
}
