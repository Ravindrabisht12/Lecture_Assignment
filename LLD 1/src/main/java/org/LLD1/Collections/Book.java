package org.LLD1.Collections;

public class Book extends Item{
    private String author;
    public Book(int id, String name, int price, int quantity, String author) {
        super(id, name, price, quantity);
        this.author = author;
    }
}
