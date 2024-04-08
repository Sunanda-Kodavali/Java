import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDatetime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Month month = date.getMonth();
        System.out.println(month);
        System.out.println(date.getDayOfMonth());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        String text = date.format(formatter);
        System.out.println(text);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("M/d/yy");
        String text1 = date.format(formatter1);
        System.out.println(text1);
    }
}
