import java.util.*;

public class Task7_SecondSmallestElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, -4, 2, 8, 10, 1, 2);


//        Optional is generally used as a return type for methods that might not always have a result to return.
//        For example, a method that looks up a user by ID might not find a match, in which case it would return an empty Optional object.
//        Optional can help reduce the number of null pointer exceptions in your code as well


//        int res = integerList.stream().distinct().sorted(Comparator.naturalOrder()).toList().get(1);


        Integer res = integerList.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        System.out.println(res);
    }
}
