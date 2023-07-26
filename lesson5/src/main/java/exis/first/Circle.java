package exis.first;

public class Circle implements Figura{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Square() {
        return 3.14 * (radius * radius);
    }

    @Override
    public double Perimetr() {
        return 2 * 3.14 * radius;
    }
}
