package excersise;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {

           List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 22),
                new Person("Aharles", "Aickens", 23),
                new Person("Bharles", "Bickens", 24),
                new Person("Dharles", "Cickens", 25),
                new Person("Eharles", "Eickens", 26)
        );

        for (int i = 0; i <= personList.size(); i++) {
            System.out.println(personList.get(i));
        }


        for (Person person : personList) {
            System.out.println(person);
        }

        personList.forEach(person -> System.out.println(person));
    }
}
