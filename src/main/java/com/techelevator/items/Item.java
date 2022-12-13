package com.techelevator.items;

import java.math.BigDecimal;

public abstract class Item {
    private int id;
    private String name;
    private BigDecimal price;


    public Item(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
    public abstract void message();
}
