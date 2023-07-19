import java.util.Arrays;

public class HomeTask3 {

    public static void main(String[] args ) {
        int[] array1 = new int[] {10,15,26,42,68};
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[] {23,29,34,56,76};
        System.out.println(Arrays.toString(array2));

        int sum1 = 0;
        for (int n : array1) {
            sum1 = sum1 + n;
        }
        System.out.println(sum1);

        int sum2 = 0;
        for (int f : array2) {
            sum2 = sum2 + f;
        }
        System.out.println(sum2);
        if (sum1>sum2) {
            System.out.println("Среднее арифметическое элементов массива 1 больше, чем массива 2");
        } else if (sum2>sum1) {
            System.out.println("Среднее арифметическое элементов массива 2 больше, чем массива 1");
        } else {
            System.out.println(" Средние арифметические элементов обоих массивов равны");
        }
    }
}
