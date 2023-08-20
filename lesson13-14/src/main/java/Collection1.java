import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Collection1 {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(3,10,2,4,2,9,24,6,35,11));
        integerList.stream()
                .distinct()
                .forEach(System.out::println);
        integerList.stream()
                .filter(integer -> integer>= 7 && integer <=17 && integer % 2 ==0)
                .forEach(System.out::println);

        integerList.stream()
                .map(integer -> integer * 2)
                .forEach(System.out::println);
        integerList.stream()
                .sorted()
                .limit(4)
                .forEach(System.out::println);
        long count = integerList.stream()
                .count();
        System.out.println(count);
        OptionalDouble average = integerList.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println(average);


    }
}
