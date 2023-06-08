package com.designpattern.structuralpattern.compositionpattern;

public class CompositeDesignPatternTest {
    public static void main(String[] args) {
        Component hd = new Leaf(8000,"HDD");
        Component mouse = new Leaf(500,"Mouse");
        Component monitor = new Leaf(10000,"Monitor");
        Component ram = new Leaf(3500,"RAM");
        Component cpu = new Leaf(4000,"CPU");

        Composite peripheral = new Composite("Peripheral");
        Composite cabinate = new Composite("Cabinate");
        Composite motherBoard = new Composite("Mother Board");
        Composite computer = new Composite("Computer");

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);
        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);
        cabinate.addComponent(hd);
        cabinate.addComponent(motherBoard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinate);

        ram.showPrice();
        System.out.println();
        peripheral.showPrice();

        System.out.println();

        cabinate.showPrice();

        System.out.println("All Details");
        computer.showPrice();

    }
}
