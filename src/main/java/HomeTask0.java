import java.util.Scanner;

public class HomeTask0 {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        Scanner numb = new Scanner(System.in);
        System.out.println("Введите любое число");
        int found = numb.nextInt();

        for (int el : arr) {
           if (el == found) {
               System.out.println("Found");
           } else {
               System.out.println("Not Found");
               break;
           }
        }
           }
        }

