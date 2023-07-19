import java.util.Scanner;

public class HomeTask2 {

    public static void main(String[] args) {

        Scanner month = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int value = month.nextInt();

        if (value >=3 && value <=5) {
            System.out.println("Сейчас весна");
        } else if (value >=6 && value <=8) {
            System.out.println("Сейчас лето");
        } else if (value >=9 && value <=11) {
            System.out.println("Сейчас осень");
        } else {
            System.out.println("Сейчас зима");
        }


        }
    }
