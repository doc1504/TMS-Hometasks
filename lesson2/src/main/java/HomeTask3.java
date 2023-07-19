import java.util.Scanner;

public class HomeTask3 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите любое число");
        int value = number.nextInt();
        if (value % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }

}
