import java.util.ArrayList;
import java.util.List;

public class Task3_DistinctValues {
    public static void main(String[] args) {
//        List<Integer> integerList = new ArrayList<>();
//        integerList.add(5);
//        integerList.add(-4);
//        integerList.add(2);
//        integerList.add(2);
//        integerList.add(-1);
//        List<Integer> distinctedList = integerList.stream().distinct().toList();

        List<String> stringList = new ArrayList<>();
        stringList.add("Robin");
        stringList.add("Jain");
        stringList.add("Jain");
        stringList.add("Akshra");
        List<String> distinctedList = stringList.stream().distinct().toList();
        System.out.println(distinctedList);
    }
}
