import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6_MaxValueIntList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, -4, 2, 8, 10, 1, 2);

    //    int res = integerList.stream().reduce(0,Integer::max);
        int res =integerList.stream().max(Integer::compare)
                .orElse(null);
        System.out.println(res);
    }
}
