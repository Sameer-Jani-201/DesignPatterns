package com.designpattern.creational.builderpattern;
/*
 * This is test class for PhoneBuilder class which builds phone object.
 */
public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
        .setOs("Android")
        .setBattery(5000)
        .setProcessor("Qualcomm")
        .setRam(4)
        .setScreenSize(6.2)
        .buildPhone();
        System.out.println(phone);
    }
}
