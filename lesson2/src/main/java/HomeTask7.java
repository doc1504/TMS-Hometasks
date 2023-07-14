import java.util.Scanner;

public class HomeTask7 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int value = number.nextInt();
        int sum = 0;
        for ( int n = 1; n <= value; n++) {
            sum = sum + n;
        }
        System.out.println("Сумма всех чисел "+ sum);
    }
}
