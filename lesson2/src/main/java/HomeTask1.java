import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {

        Scanner numb = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int value = numb.nextInt();

        switch (value) {
            case 1,2,12:
                System.out.println("Зима");
                break;
            case 3,4,5:
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
        }

    }

}
