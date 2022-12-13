package com.techelevator.items;

import java.math.BigDecimal;

public class Gum extends Item{
    public Gum(int id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public void message() {
        System.out.println("Chew Chew, Yum!");
    }
}
