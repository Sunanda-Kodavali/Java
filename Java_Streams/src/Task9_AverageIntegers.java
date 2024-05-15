import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Task9_AverageIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(-4);
        integerList.add(2);
        integerList.add(10);
        integerList.add(-1);
        OptionalDouble avg = integerList.stream().mapToInt(Integer::intValue).average();
        System.out.println(avg);
    }
}
