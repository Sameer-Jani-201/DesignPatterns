package com.designpattern.structuralpattern.decoratorpattern;

public class Tomatoes extends PizzaToppings{
    public Tomatoes(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.description() +" "+"Tomatoes";
    }

    @Override
    public Double cost() {
        return pizza.cost() + 1.0;
    }
}
