import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task5_SortbyDescStrings {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Robin");
        stringList.add("Jain");
        stringList.add("ravan");
        stringList.add("Akshra");

        List<String> stringListbyDesc =stringList.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(stringListbyDesc);
    }
}
