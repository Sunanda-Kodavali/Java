package MyExcercises;

import java.util.Arrays;
import java.util.List;

public class LongestWordLetterCount {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Robin", "Jain", "Ravanasura", "Akshra");

        System.out.println(stringList.stream().mapToInt(String::length).max());

    }
}
