package org.LLD1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Client {

    public static void main(String[] args) throws InvalidQuantityException {
        List<Item> items = new ArrayList<Item>();

        Clothing c = new Clothing("C1", "T-Shirt", 90.25, 0, "M");
        Electronics e = new Electronics("E1", "Mobile", 55, 4, 20);
        // Clothing c1 = new Clothing("C1", "T-Shirt", 90.25, -1, "M"); Error quantity less than 0;


        // O(1)
        items.add(new Electronics("E2", "Trimmer", 59, 1, 20));
        items.add(new Book("B1", "Java Book", 60.00, 2, "Ravindra"));
        items.add(new Clothing("C2", "T-Shirt", 30, 5, "L"));
//
//        System.out.println(items.get(0).compareTo(items.get(1)));

        // nlog(n)
        Collections.sort(items);

        // System.out.println(items);



        /**
         * Inventory management
         */
        Inventory<Item> inventory = new Inventory<>();

        // Add item in inventory
        inventory.addItem(c);
        inventory.addItem(e);
//        inventory.addItem(e); Error item already exist

        // Get inventory item
        inventory.getItem("E1");

        // Get all inventory items
        List<Item> allItems = inventory.getItems();

        // Remove inventory item
        inventory.removeItem("C1");
        inventory.removeItem("C1");
    }
}
