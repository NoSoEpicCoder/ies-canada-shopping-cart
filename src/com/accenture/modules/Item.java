package com.accenture.modules;

import com.accenture.modules.items.ItemType;

import java.math.BigDecimal;

public abstract class Item {

    private int id;
    private String name;
    private ItemType itemType;
    private String description;
    private BigDecimal price;

    public Item(int id, String name, ItemType itemType, BigDecimal price){
        this.id = id;
        this.name = name;
        this.itemType = itemType;
        this.price = price;
    }

    public Item(){

    }

    public Item withDescription(String description) {
        this.description = description;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

}
