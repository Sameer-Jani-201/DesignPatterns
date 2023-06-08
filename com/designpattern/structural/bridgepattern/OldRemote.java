package com.designpattern.structural.bridgepattern;

public class OldRemote implements Remote{
    @Override
    public void on() {
        System.out.println("On with Old Remote");
    }

    @Override
    public void off() {
        System.out.println("OFF with Old Remote");
    }
}
