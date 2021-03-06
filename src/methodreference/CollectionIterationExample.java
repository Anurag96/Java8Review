package methodreference;

 import excersise.Person;

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

        System.out.println("Using for loop");
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }

        System.out.println("Using external for each loop");
        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println("Using JAVA 8 Internal for each loop using lambda expression");
        personList.forEach(person -> System.out.println(person));

        System.out.println("Using JAVA 8 Internal for each loop using method reference");
        personList.forEach(System.out::println);
    }
}
