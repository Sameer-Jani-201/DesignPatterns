package com.designpattern.creational.singletonpattern;
/*
 * This class is testing for Singleton Pattern Design
 */
public class SingletonPatternTest {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        SingleObject secondObject = SingleObject.getInstance();
        System.out.println(singleObject);
        System.out.println(secondObject);
    }
}
