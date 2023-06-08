package com.designpattern.structuralpattern.compositionpattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
 
    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component c: components){
            c.showPrice();
        }
    }
}
