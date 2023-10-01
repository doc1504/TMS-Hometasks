package org.example;

public class Cream extends Decorator{

    private final Drink drink;

    public Cream(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Cream";
    }

    @Override
    public double cost() {
        return 0.15 + drink.cost();
    }
}
