package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitTest1Java7 {

    public static void main(String[] args) {


        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 22),
                new Person("Aharles", "Aickens", 23),
                new Person("Bharles", "Bickens", 24),
                new Person("Dharles", "Cickens", 25),
                new Person("Eharles", "Eickens", 26)
        );

        //Java 7
        //Step 1: Sort list by last name
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        //Step 2: Create a method that print all the elements in it
        System.out.println("Print the all the names");
        printAll(personList);
        //Step 3:Create a method that print all people that hve last name beginning with c

        System.out.println("Print the all the last name with C");
        printConditionally(personList, new Condition() {
            @Override
            public Boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("Print the all the first name with C");
        printConditionally(personList, new Condition() {
            @Override
            public Boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });
    }


    private static void printConditionally(List<Person> personList, Condition condition) {
//        for(Person p : personList){
//           if(p.getLastName().startsWith("C"))
//            System.out.println(p);
//        }
        for (Person p : personList) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> personList) {
        for (Person p : personList) {
            System.out.println(p);
        }
        System.out.println("");
    }

    interface Condition {
        Boolean test(Person p);
    }
}
