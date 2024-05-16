import java.util.*;

public class Task8_SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, -4, 2, 8, 10, 1, 2);

        //   int res = integerList.stream().distinct().sorted(Comparator.reverseOrder()).toList().get(1);

        Integer res = integerList.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst().orElse(null);
        System.out.println(res);
    }
}
