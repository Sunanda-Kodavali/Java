import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4_CountStringsWithSpecificStartLetter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Robin", "Jain", "ravan", "Akshra");

        long count = stringList.stream().filter(s -> s.startsWith(String.valueOf('R'))).count();
        System.out.println(count);

//        long count = countStringsWithSpecificStartLetter(stringList, "R");
//        System.out.println(count);
    }

    private static long countStringsWithSpecificStartLetter(List<String> stringList, String str) {

        return stringList.stream().filter(s -> Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(str.charAt(0))).count();
    }
}
