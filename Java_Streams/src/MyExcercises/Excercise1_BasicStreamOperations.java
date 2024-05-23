package MyExcercises;

import java.util.List;
import java.util.stream.IntStream;

public class Excercise1_BasicStreamOperations {
    public static void main(String[] args) {

        List<Integer> listIntegers = IntStream.rangeClosed(1, 20).boxed().toList();
        System.out.println("Integers from 1 to 20 : "+listIntegers);

        List<Integer> listEvenIntegers = listIntegers.stream().filter( n -> n % 2 == 0).toList();
        System.out.println("Even Integers from 1 to 20 : "+listEvenIntegers);

        List<Integer> listSquareEachIntegers = listIntegers.stream().mapToInt( n -> n * n).boxed().toList();
        listSquareEachIntegers.forEach(integer -> System.out.print(integer+ " "));

    }
}
