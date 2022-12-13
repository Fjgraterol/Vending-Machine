package com.techelevator.items;

import java.math.BigDecimal;

public class Candy extends Item{
    public Candy(int id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public void message() {
        System.out.println("Munch Munch, Yum");
    }
}
