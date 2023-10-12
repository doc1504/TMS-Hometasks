package org.example;

public class Latte extends Drink{

    public Latte() {
        this.description = "Latte";
    }

    @Override
    public double cost() {
        return 5.5;
    }
}
