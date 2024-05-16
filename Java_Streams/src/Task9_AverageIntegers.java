import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Task9_AverageIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, -4, 2, 8, 10, 1, 2);

  //      double avg = integerList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);


        DoubleStream doubleStream = DoubleStream.of(5, -4, 2, 8, 10, 1, 2);
        double avg = doubleStream.average().orElse(0.0);

        System.out.println(avg);
    }
}
