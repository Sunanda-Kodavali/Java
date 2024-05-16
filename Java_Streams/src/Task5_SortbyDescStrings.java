import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task5_SortbyDescStrings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Robin", "Jain", "Ravan", "Akshra");


        List<String> stringListbyDesc =stringList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(stringListbyDesc);
    }
}
