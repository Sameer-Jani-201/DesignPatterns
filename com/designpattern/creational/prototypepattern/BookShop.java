package com.designpattern.creational.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> books = new ArrayList<>();
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public List<Book> getBooks() {
        return books;
    }
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void loadBooks(){
        for(int i=1;i<=10;i++){
            Book book = new Book();
            book.setBookId(i);
            book.setBookName("Book "+i);
            getBooks().add(book);
        }
    }
    @Override
    public String toString() {
        return "BookShop [shopName=" + shopName + ", books=" + books + "]";
    }

    /*
     * This method is override to implement deep cloning instead of shadow cloning.
     */
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for(Book b: getBooks()){
            bookShop.getBooks().add(b);
        }
        bookShop.setShopName(getShopName());
        return bookShop;
    }


}
