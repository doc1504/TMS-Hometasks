package org.example;

public abstract class Drink {

    protected String description = "Unknowm drink";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
