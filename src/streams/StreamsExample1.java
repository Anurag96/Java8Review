package streams;

import excersise.Person;

import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 22),
                new Person("Aharles", "Cickens", 23),
                new Person("Bharles", "Bickens", 24),
                new Person("Dharles", "Cickens", 25),
                new Person("Eharles", "Eickens", 26)
        );

        // Streams : A sequence of elements supporting sequential and parallel aggregattion operations.
        people.stream()
                .filter(p-> p.getLastName().startsWith("C"))
                .filter(p->p.getFirstName().startsWith("A"))
                .forEach(p -> System.out.println(p.getFirstName()));

        long count = people.parallelStream()
                .filter(p-> p.getLastName().startsWith("C"))
                .filter(p->p.getFirstName().startsWith("A"))
                .count();
        System.out.println(count);

}
}
