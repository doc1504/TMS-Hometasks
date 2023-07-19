import java.util.Arrays;
import java.util.Scanner;

public class NewHomeTask1 {

    public static void main(String[] args) {

        int[] first = new int[] {2,4,6,8,10,10,12,14,16,18,20};
        Scanner number = new Scanner(System.in);
        System.out.println("Введите любое число");
        int found = number.nextInt();

        int count = 0;
        boolean result = false;

       for (int el : first) {
           if (el == found) {
               count ++;
               result = true;
           }
       }
           if (result == false) {
               System.out.println("Данного числа нет в массиве");
               return;
           }
           int step = 0;
           int[] second = new int[first.length - count];
           for (int i = 0; i < first.length; i++) {
               if (first[i] != found) {
                   second[step] = first[i];
                   step++;
               }
           }
           System.out.println(Arrays.toString(second));
    }

}


