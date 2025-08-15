package org.LLD1.Collections;

public class Item implements Comparable<Item>{
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item(String id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * this.compareTo(other)
     *
     * Sorted order
     * < 0 -> That means the current Item is less than other -> | this ... other |
     * = 0 -> That means the current item is equal to other -> | this ... other | or | other ... this |
     * > 0 -> That means the item is greater than the other -> | other ... this |
     *
     */


//    // Compare by price
//    @Override
//    public int compareTo(Item o) {
//        if(this.price < o.price){
//            return -1;
//        }else if(this.price > o.price){
//            return 1;
//        }
//
//        return 0;
//    }

    // Compare by name
    @Override
    public int compareTo(Item o) {
        return this.name.compareTo(o.name);
    }


}
