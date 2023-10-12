package org.example.abstract_factory;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {

        if (shapeType == null){
        return null;
    }

        if (shapeType.equalsIgnoreCase("circle")){
             return new Circle();

        } else if (shapeType.equalsIgnoreCase("Rectangle")) {

            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("Square")) {

            return new Square();

        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
