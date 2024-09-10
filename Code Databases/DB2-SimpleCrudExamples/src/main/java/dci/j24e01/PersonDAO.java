package dci.j24e01;

import java.util.List;

public interface PersonDAO {
    Person findPerson(Long id);

    List<Person> findPeople();

    Person updatePerson(Person person);

    Person insertPerson(Person person);

    boolean deletePerson(Long id);
}