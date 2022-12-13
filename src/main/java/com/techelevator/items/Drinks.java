package com.techelevator.items;

import java.math.BigDecimal;

public class Drinks extends Item{
    public Drinks(int id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public void message() {
        System.out.println("Glug Glug, Yum!");
    }
}
