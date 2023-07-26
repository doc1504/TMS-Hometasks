package exis.first;

public class Triangle implements Figura{

    double size1;
    double size2;
    double size3;
    double sinus;

    public Triangle(double size1, double size2, double size3, double sinus ) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
        this.sinus = sinus;
    }

    @Override
    public double Square() {
        return ((size1 * size2)/0.5) * sinus;
    }

    @Override
    public double Perimetr() {
        return size1 + size2 + size3;
    }
}
