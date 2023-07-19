package exis.first;

public class Rectangle implements Figura{

    double size1;
    double size2;

    public Rectangle(double size1, double size2) {
        this.size1 = size1;
        this.size2 = size2;

    }

    @Override
    public double Square() {
        return size1 * size2;
    }

    @Override
    public double Perimetr() {
        return (size1 + size2) * 2;
    }
}
