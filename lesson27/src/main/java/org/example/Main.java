package org.example;

public class Main {
    public static void main(String[] args) {
        Drink newDrink = new Marshmallow(new Cinnamon(new Cream(new Latte())));
        System.out.println("Your drink : " + newDrink.getDescription());
        System.out.println("Cost : " + newDrink.cost());
    }
}