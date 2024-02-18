package fetch;

import java.util.ArrayList;
import java.util.List;

public class FetchDataProcedural {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(1, "Alice"));
        people.add(new Person(2, "Bob"));
        people.add(new Person(3, "Charlie"));

        int targetId = 2;
        Person targetPerson = null;
        for (Person person : people) {
            if (person.getId() == targetId) {
                targetPerson = person;
                break;
            }
        }

        if (targetPerson != null) {
            System.out.println("Found person with ID " + targetId + ": " + targetPerson.getName());
        } else {
            System.out.println("No person found with ID " + targetId);
        }
    }
}
