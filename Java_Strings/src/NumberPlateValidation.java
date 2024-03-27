import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPlateValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regPlate = scanner.next();
        boolean b = isRegistrationNumberValid(regPlate);
        System.out.println(b);

    }

    private static boolean isRegistrationNumberValid(String regPlate) {
        Pattern patternAlphabets = Pattern.compile("[A-Z]{3}-[0-9]{3}");
        Matcher matcherAlphabets = patternAlphabets.matcher(regPlate);
        return matcherAlphabets.matches();
    }
}
