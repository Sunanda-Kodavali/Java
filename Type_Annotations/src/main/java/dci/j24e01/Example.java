package dci.j24e01;

import java.util.List;

public class Example {

    private @Positive int number;

    public Example(@Positive int number) {
        this.number = number;
    }

    public void setNumber(@Positive int number) {
        this.number = number;
    }

    public @Positive int getNumber() {
        return number;
    }

    public <T extends @Positive Comparable<T>> T findMax(T a, T b) {
        return a.compareTo(b) > 0 ? a : b;
    }

    public void processNumber(Object obj) {

        @Positive Integer number = (Integer) obj;
        System.out.println(number);
    }

    private List<@Positive Integer> positiveNumbersList;
}

