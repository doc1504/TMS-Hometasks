package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Subject{

    protected List<Observer> observers = new ArrayList<>();
    protected String name;
    protected String newEmail;

    public Newsletter(String name) {
        this.name = name;
    }
    public void addNewEmail (String newEmail){
        this.newEmail = newEmail;
        notifySubscribers();
    }

    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeSubscriber(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifySubscribers() {
        observers.forEach(observer -> observer.update(newEmail));

    }
}
