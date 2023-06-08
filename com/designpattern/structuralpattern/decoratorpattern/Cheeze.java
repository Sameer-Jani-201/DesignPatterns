package com.designpattern.structuralpattern.decoratorpattern;

public class Cheeze extends PizzaToppings{
    public Cheeze(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.description() +" "+"Cheeze";
    }

    @Override
    public Double cost() {
        return pizza.cost() + 2.5;
    }
}
