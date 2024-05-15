import java.util.ArrayList;
import java.util.List;

public class Task1_ListStringsUppercase {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Robin");
        stringList.add("Jain");
        stringList.add("Ravan");
        stringList.add("Akshra");

        List<String> upperCaseStringList = stringList.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseStringList);
    }
}
