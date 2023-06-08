package com.designpattern.behavioral.observerpattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCustomerName("Sameer");

        Customer customer2 = new Customer();
        customer2.setCustomerName("Ankit");

        Product iphone13 = new Product();
        iphone13.setProductName("iPhone 13");
        iphone13.setAvailable(false);

        iphone13.registerObserver(customer);
        iphone13.registerObserver(customer2);

        iphone13.setAvailable(true);

    }
}
