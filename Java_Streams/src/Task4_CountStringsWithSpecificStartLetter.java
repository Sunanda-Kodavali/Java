import java.util.ArrayList;
import java.util.List;

public class Task4_CountStringsWithSpecificStartLetter {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Robin");
        stringList.add("Jain");
        stringList.add("ravan");
        stringList.add("Akshra");

        long count = countStringsWithSpecificStartLetter(stringList, "R");
        System.out.println(count);
    }

    private static long countStringsWithSpecificStartLetter(List<String> stringList, String str) {

        return stringList.stream().filter(s -> Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(str.charAt(0))).count();
    }
}
