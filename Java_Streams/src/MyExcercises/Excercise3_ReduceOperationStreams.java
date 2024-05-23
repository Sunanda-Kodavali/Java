package MyExcercises;

import java.util.Arrays;
import java.util.List;

public class Excercise3_ReduceOperationStreams {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(5, 4, 2, 8, 10, 1, 2);

        int sum = integerList.stream().reduce(0,Integer::sum);
        System.out.println("Sum of Integers: "+sum);

        int product = integerList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product of Integers: "+product);



    }
}
