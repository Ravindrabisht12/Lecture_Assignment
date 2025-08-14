package org.LLD1.Collections;

public class Electronics extends Item{
    private int warranty;
    public Electronics(int id, String name, int price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }
}
