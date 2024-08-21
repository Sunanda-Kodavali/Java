import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Whiskers", 3));
        cats.add(new Cat("Shadow", 5));
        cats.add(new Cat("Mittens", 2));
        cats.add(new Cat("Tom", 4));
        cats.add(new Cat("Jerry", 1));
        cats.add(new Cat("Simba", 3));
        cats.add(new Cat("Nala", 4));
        cats.add(new Cat("Garfield", 6));
        cats.add(new Cat("Sylvester", 7));
        cats.add(new Cat("Felix", 2));
        cats.add(new Cat("Socks", 5));
        cats.add(new Cat("Tiger", 6));
        cats.add(new Cat("Chloe", 3));
        cats.add(new Cat("Bella", 1));
        cats.add(new Cat("Luna", 2));
        cats.add(new Cat("Oliver", 4));
        cats.add(new Cat("Leo", 3));
        cats.add(new Cat("Milo", 7));
        cats.add(new Cat("Jasper", 5));
        cats.add(new Cat("Paws", 2));

        Optional<Cat> theChosencat = findCatByName(cats, "Garfield");

        System.out.println(theChosencat.orElse(new Cat("Unknown", 0)));
    }

    public static Optional<Cat> findCatByName(List<Cat> cats, String name){
        return cats.stream()
                .filter(cat -> cat.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}