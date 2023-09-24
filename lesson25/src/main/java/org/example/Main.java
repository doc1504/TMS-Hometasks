package org.example;

public class Main {
    public static void main(String[] args) {

        MySingleton firstInstance = MySingleton.getInstance();

        MySingleton secondInstance = MySingleton.getInstance();

        System.out.println(firstInstance == secondInstance);

    }
}