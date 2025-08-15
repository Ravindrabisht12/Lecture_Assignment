package org.LLD1.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item>{
    HashMap<String, T> items;

    public Inventory(){
         items = new HashMap<>();
    }

    public void addItem(T item) throws InvalidQuantityException{
        if(item.getQuantity() < 0){
            throw new InvalidQuantityException("Quantity is less than equal to 0");
        }else if(items.containsKey(item.getId())){
            try {
                throw new DuplicateItemException("Item "+ item.getId() + " already exist");
            } catch (DuplicateItemException e) {
                throw new RuntimeException(e);
            }
        }
        items.put(item.getId(), item);
    }

    public void removeItem(String id){
        items.remove(id);
    }

    public T getItem(String id){
        return items.get(id);
    }

    public List<T> getItems(){
        return new ArrayList<>(items.values());
    }

}
