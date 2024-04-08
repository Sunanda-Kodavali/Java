import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AgeOfUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.next();

        LocalDate parsedDate = parseDate(dateStr);
        LocalDate today = LocalDate.now();
        System.out.println(Period.between(parsedDate, today).getYears());

    }
    public static LocalDate parseDate(String inputDate) {
        LocalDate parsedDate = null;
        String[] formats = {
                "yyyy-MM-dd",
                "yy-MM-dd"
        };
        for (String format : formats) {
            System.out.println(format.length());
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                parsedDate = LocalDate.parse(inputDate, formatter);
                break;  // Stop when a valid format is found
            } catch (DateTimeParseException e) {
                // Format doesn't match, try the next one
            }
        }
        return parsedDate;
    }
}
