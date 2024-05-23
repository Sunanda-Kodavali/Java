package MyExcercises.Excercise2_StreamWithCustomObjects;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Bob", 16));
        persons.add(new Person("Ram", 19));
        persons.add(new Person("John", 18));
        persons.add(new Person("Bar", 17));

        List<String> listPersonNames = persons
                .stream()
                .filter(person -> person.age() < 18)
                .map(Person::name)
                .toList();
        System.out.println(listPersonNames);


    }
}
