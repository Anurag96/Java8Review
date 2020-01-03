package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnitTest1Java8 {

    public static void main(String[] args) {


        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 22),
                new Person("Aharles", "Aickens", 23),
                new Person("Bharles", "Bickens", 24),
                new Person("Dharles", "Cickens", 25),
                new Person("Eharles", "Eickens", 26)
        );

        //Java 8
        //Step 1: Sort list by last name
        Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2: Create a method that print all the elements in it
        System.out.println("Print the all the names");
        printConditionally(personList, p -> true);

        //Step 3:Create a method that print all people that hve last name beginning with c

        System.out.println("Print the all the last name with C");
        printConditionally(personList, (p) -> p.getLastName().startsWith("C"));

        System.out.println("Print the all the first name with C");
        printConditionally(personList, (p) -> p.getFirstName().startsWith("C"));
    }


    private static void printConditionally(List<Person> personList, Condition condition) {
        for (Person p : personList) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    interface Condition {
        Boolean test(Person p);
    }
}
