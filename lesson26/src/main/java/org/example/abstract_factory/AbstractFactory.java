package org.example.abstract_factory;

public abstract class AbstractFactory {
    abstract  Shape getShape (String shape);
    abstract Color getColor (String color);
}
