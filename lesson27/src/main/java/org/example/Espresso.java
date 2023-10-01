package org.example;

public class Espresso extends Drink{

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 5;
    }
}
