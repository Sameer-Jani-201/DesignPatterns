package com.designpattern.structural.decoratorpattern;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Pizza panPizza = new PanPizza();
        panPizza = new Tomatoes(panPizza);
        panPizza = new Onions(panPizza);
        panPizza = new Cheeze(panPizza);

        System.out.println("You ordered - Pan Pizza");
        System.out.println("Your total cost : "+panPizza.cost());
        System.out.println("Your pizza toppings with : "+panPizza.description());
    }
}
