import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task8_SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(-4);
        integerList.add(2);
        integerList.add(10);
        integerList.add(-1);
      //  int res = integerList.stream().distinct().sorted(Comparator.reverseOrder()).toList().get(1);
        Optional<Integer> res = integerList.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst();
        System.out.println(res);
    }
}
