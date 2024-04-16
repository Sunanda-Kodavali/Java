import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Animal> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Dog());
        pets.add(new Dog());
        pets.add(new Cat());

        for (Animal animal : pets) {
            animal.communicate();
        }
    }
}