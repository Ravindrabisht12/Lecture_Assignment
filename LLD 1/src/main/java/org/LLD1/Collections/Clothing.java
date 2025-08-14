package org.LLD1.Collections;

public class Clothing extends Item{
    private int size;
    public Clothing(int id, String name, int price, int quantity, int size) {
        super(id, name, price, quantity);
        this.size = size;
    }
}
