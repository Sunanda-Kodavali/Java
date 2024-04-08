import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitExample {
    public static void main(String[] args) {

        long days = ChronoUnit.DAYS.between(LocalDate.now(),LocalDate.parse("2024-09-08"));
        long months = ChronoUnit.MONTHS.between(LocalDate.now(),LocalDate.parse("2024-09-08"));
        System.out.println(days);
        System.out.println(months);
        long hours = ChronoUnit.HOURS.between(LocalDateTime.now(),LocalDateTime.of(2024,9,8,16,24));

        System.out.println(hours);
    }
}
