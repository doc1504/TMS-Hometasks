import java.time.DayOfWeek;
import java.time.LocalDate;

public class lesson15 {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2023,8,14);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDate localDate1 = localDate.plusDays(8);
        System.out.println("Дата следующего вторника: " + localDate1);
    }
}
