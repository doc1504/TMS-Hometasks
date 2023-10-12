package org.example.observer;

public interface Subject {

    void addSubscriber (Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers();
}
