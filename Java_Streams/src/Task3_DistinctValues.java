import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3_DistinctValues {
    public static void main(String[] args) {

//        List<Integer> integerList = Arrays.asList(5, -4, 2, 8, 10, 1, 2);

//        List<Integer> distinctedList = integerList.stream().distinct().toList();

        List<String> stringList = Arrays.asList("Robin", "Robin", "Ravan", "Akshra");

        List<String> distinctedList = stringList.stream().distinct().toList();

        System.out.println(distinctedList);
    }
}
