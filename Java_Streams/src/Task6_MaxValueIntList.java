import java.util.ArrayList;
import java.util.List;

public class Task6_MaxValueIntList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(-4);
        integerList.add(2);
        integerList.add(10);
        integerList.add(-1);
        int res = integerList.stream().reduce(0,Integer::max);
        System.out.println(res);
    }
}
