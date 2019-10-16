package com.accenture;

import com.accenture.modules.Catalog;
import com.accenture.modules.Item;
import com.accenture.modules.items.Book;
import com.accenture.modules.items.ItemType;

public class Main {

    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        System.out.println("Printing all items: ");
        for(Item item : catalog.getItems())
            System.out.println(item.getId()+","+item.getName()+","+item.getPrice()+","+item.getItemType());
    }
}
