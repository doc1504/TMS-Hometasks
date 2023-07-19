import java.util.Scanner;

public class HomeTask4 {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Введите температуру");
        int t = temp.nextInt();
         if (t > -5) {
             System.out.println(" На улице тепло");
         } else if (t <= -5 && t > -20) {
             System.out.println(" На улице нормально");
         } else if (t <= -20) {
             System.out.println(" На улице холодно");
         }
    }
}
