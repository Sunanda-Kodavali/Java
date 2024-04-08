import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dob = scanner.nextLine();
        if(dob.length() == 8)
        {
            int year = Integer.parseInt(dob.substring(0,2));
            String subStr2 = dob.substring(2);

            if (year < 100 && year > 24) {
                year += 1900;
            }
            if (year < 100 && year <= 24) {
                year += 2000;
            }
            LocalDate date1 = LocalDate.parse(String.valueOf(year)+subStr2);
            LocalDate date2 = LocalDate.now();

            System.out.println(Period.between(date1, date2).getYears());

        }else{
            LocalDate date1 = LocalDate.parse(dob);
            LocalDate date2 = LocalDate.now();
            System.out.println(Period.between(date1, date2).getYears());
        }
    }
}
