package exis.first;

public class Main {

    public static void main(String[] args) {
        Figura triangle1 = new Triangle(5, 10,15,35);
        Figura triangle2 = new Triangle(10,15,30,45);
        Figura rectangle1 = new Rectangle(20,40);
        Figura rectangle2 = new Rectangle(15,35);
        Figura circle = new Circle(15);

        Figura[] figuras = {triangle1, triangle2, rectangle1, rectangle2, circle};

        double result = 0;
        for (Figura figura : figuras) {
            double perimetr = figura.Perimetr();
            result = result + perimetr;
        }

        System.out.println(result);



    }
}
