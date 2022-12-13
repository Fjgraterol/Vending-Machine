package com.techelevator.items;

import java.math.BigDecimal;

public class Chip extends Item {

    public Chip(int id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public void message() {
        System.out.println("Crunch Crunch, Yum!");
    }
}
