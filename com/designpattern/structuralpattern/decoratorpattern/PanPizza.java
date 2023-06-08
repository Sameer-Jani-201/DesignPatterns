package com.designpattern.structuralpattern.decoratorpattern;

public class PanPizza implements Pizza{
    
    @Override
    public String description() {
        return "Pan Pizza";
    }

    @Override
    public Double cost() {
        return 10.0;
    }
}
