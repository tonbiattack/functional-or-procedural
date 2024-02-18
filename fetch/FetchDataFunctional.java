package fetch;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FetchDataFunctional {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Alice"));
        people.add(new Person(2, "Bob"));
        people.add(new Person(3, "Charlie"));

        int targetId = 2;
        Optional<Person> targetPerson = people.stream()
                .filter(person -> person.getId() == targetId)
                .findFirst();

        targetPerson.ifPresentOrElse(
                person -> System.out.println("Found person with ID " + targetId + ": " + person.getName()),
                () -> System.out.println("No person found with ID " + targetId));
    }
}
