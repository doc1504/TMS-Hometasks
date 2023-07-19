import java.util.Scanner;

public class FixedHomeTask0 {

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,4,5,6,8,10,12,15};
        Scanner number = new Scanner(System.in);
        System.out.println("Введите любое число");
        int found = number.nextInt();
        boolean result = false;

        for (int el : arr) {
            if (el == found) {
                System.out.println("Заданное число входит в массив");
                result = true;
            }
        }
            if (result == false) {
                System.out.println("Заданное число не входит в массив");
            }

    }
}
