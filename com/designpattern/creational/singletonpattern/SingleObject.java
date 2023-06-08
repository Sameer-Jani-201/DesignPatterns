package com.designpattern.creational.singletonpattern;
/*
 * This is Singleton Pattern class. This class object will be only one within entire application scope.
 */
public class SingleObject {
    private static SingleObject instance;

    private SingleObject(){}

    // This method kept synchronized so object creation for this class will be thread safe.
    // This is lazy type object creation method where when first time object requested that time object will be created.
    // Another type is eager object creation where one object is already created at declaration time. Eg: private static SingleObject instance = new SingleObject();
    // and this getInstance method will just return instance only.
    public static synchronized SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }
}
