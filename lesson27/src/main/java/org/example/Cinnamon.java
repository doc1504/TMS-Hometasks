package org.example;

public class Cinnamon extends Decorator {

    private final Drink drink;

    public Cinnamon(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Cinnamon";
    }

    @Override
    public double cost() {
        return 0.30 + drink.cost();
    }
}
