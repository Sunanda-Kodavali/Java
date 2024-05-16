import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1_ListStringsUppercase {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Robin", "Jain", "Ravan", "Akshra");

        List<String> upperCaseStringList = stringList.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseStringList);
    }
}
