package MyExcercises;

import java.util.List;
import java.util.stream.IntStream;

public class Excercise4_StreamPipelines {
    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1, 10000).boxed().toList();
        System.out.println(integerList);

        long startTime = System.currentTimeMillis();


        List<Double> multiplesThreeList = integerList.stream()
                .filter(i -> i % 3 == 0)
                .mapToDouble(Math::sqrt)
                .limit(10)
                .boxed()
                .toList();

        System.out.println(multiplesThreeList);

        long endTime = System.currentTimeMillis();

        long duration = endTime - startTime;

        System.out.println("Time in Millis: "+duration);
    }
}
