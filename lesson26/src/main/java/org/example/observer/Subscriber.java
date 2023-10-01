package org.example.observer;

public class Subscriber implements Observer{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(String newEmail) {
        System.out.println("Email for: " + name + " | Content: " + newEmail);
    }
}
