package com.designpattern.creational.prototypepattern;
/*
 * This is test class for Prototype Design Pattern.
 */
public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Sameer Book Shop");
        bookShop.loadBooks();
        BookShop bookShop2 = bookShop.clone();// Prototype done by clone method.
        bookShop2.setShopName("Jani Book Shop");
        bookShop.getBooks().remove(3);
        System.out.println(bookShop);
        System.out.println();
        
        System.out.println(bookShop2);
    }
}
