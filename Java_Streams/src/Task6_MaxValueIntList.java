import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6_MaxValueIntList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, -4, 2, 8, 10, 1, 2);

  //      List<Integer> integerList = new ArrayList<>();


     //   int res = integerList.stream().reduce(Integer.MIN_VALUE,Integer::max);
        int res =integerList.stream().max(Integer::compare)
                .orElse(0);
        System.out.println(res);
    }
}
