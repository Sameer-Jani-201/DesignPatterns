package com.designpattern.behavioral.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{

    private String productName;
    private List<Observer> listOfObservers = new ArrayList<>();

    private boolean available;


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Observer> getListOfObservers() {
        return listOfObservers;
    }

    public void setListOfObservers(List<Observer> listOfObservers) {
        this.listOfObservers = listOfObservers;
    }

    @Override
    public void registerObserver(Observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying all the registered customers, when the product becomes available.");
        for(Observer o: listOfObservers){
            o.update(productName);
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if(this.available){
            notifyObservers();
        }
    }
    
}
