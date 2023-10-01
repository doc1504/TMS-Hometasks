package org.example.abstract_factory;

public class MainApp {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Color red = colorFactory.getColor("Red");
        red.fill();

        Color green = colorFactory.getColor("Green");
        green.fill();

        Color blue = colorFactory.getColor("Blue");
        blue.fill();
    }
}
