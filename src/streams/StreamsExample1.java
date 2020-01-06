package streams;

import excersise.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 22),
                new Person("Aharles", "Aickens", 23),
                new Person("Bharles", "Bickens", 24),
                new Person("Dharles", "Cickens", 25),
                new Person("Eharles", "Eickens", 26)
        );

        people.stream()
                .filter(p-> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));
}
}
