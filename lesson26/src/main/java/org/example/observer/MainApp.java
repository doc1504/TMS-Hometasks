package org.example.observer;

public class MainApp {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter("News");

        Observer first = new Subscriber("Giorgi");
        Observer second = new Subscriber("Olga");
        Observer third = new Subscriber("Alex");

        newsletter.addSubscriber(first);
        newsletter.addNewEmail("News from Belarus");
        newsletter.removeSubscriber(first);


        newsletter.addSubscriber(second);
        newsletter.addSubscriber(third);
        newsletter.addNewEmail("Read hot news");

    }
}
