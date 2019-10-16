package com.accenture.modules;

import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart(){

    }

    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
