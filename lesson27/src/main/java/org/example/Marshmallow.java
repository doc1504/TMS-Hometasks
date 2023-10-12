package org.example;

public class Marshmallow extends Decorator{

    private final Drink drink;

    public Marshmallow(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Marshmallow";
    }

    @Override
    public double cost() {
        return 1.5 + drink.cost();
    }
}
