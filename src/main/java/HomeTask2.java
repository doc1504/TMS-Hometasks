import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeTask2 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = number.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        int sum = 0;
        for (int v : array) {
            sum = sum + v;
        }
        double av = sum / array.length;
        System.out.println("Максимальное значение "+ max);
        System.out.println("Минимальное значение " + min);
        System.out.println("Среднее значение "+av);
    }
}
