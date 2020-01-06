package streams;

import excersise.Person;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String[] args) throws IOException {
        System.out.println("*********Printing the range from 1-10***********");
        IntStream
                .range(1, 10)
                .forEach(System.out::println);

        System.out.println("********Skipping till 5************");
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(p-> System.out.println(p));

        System.out.println("********Summing up the numbers between 1-10************");
        System.out.println( IntStream
                .range(1, 10)
                .sum());

       System.out.println("*********Stream.of, sorted and findFirst***********");
        Stream.of("Tallie","Marie","Anurag","Oliver","Kumar")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("*********Stream from Array, then sort,then filter and print***********");
        String[] names={"Tallie","Marie","Anurag","Oliver","Kumar"};
        Stream.of(names)
                .sorted()
                .filter(p-> p.startsWith("M"))
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("*********Average of squraes of an int array***********");
        Arrays.stream(new int[]{2,4,6,8,10})
                .map(p-> p*p)
                .average()
                .ifPresent(p-> System.out.println(p));

        System.out.println("*********Stream from the list,filter and print***********");
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 22),
                new Person("Aharles", "Cickens", 23),
                new Person("Bharles", "Bickens", 24),
                new Person("Dharles", "Cickens", 25),
                new Person("Eharles", "Eickens", 26)
        );
        people.stream()
                   .filter(x->x.getFirstName().startsWith("B"))
                   .forEach(x-> System.out.println(x));

        System.out.println("*********Stream from the list,filter and print***********");

        List<String> listofpeople=Arrays.asList("Tallie","Marie","Anurag","Oliver","Kumar");
        listofpeople.stream()
                .map(String::toLowerCase)
                .filter(p->p.startsWith("m"))
                .forEach(System.out::println);

        System.out.println("*********Stream rows from text file,sort,filter and print***********");

        Stream<String> bands= Files.lines(Paths.get("D:/Java8Review/src/streams/bands.txt"));
        bands.sorted()
                .filter(x->x.length()>12)
                .forEach(System.out::println);
        bands.close();

        System.out.println("*********Stream rows from text file and save to list***********");

        List<String> bands2= Files.lines(Paths.get("D:/Java8Review/src/streams/bands.txt"))
                .filter(x->x.contains("jit"))
                .collect(Collectors.toList());
                bands2.forEach(System.out::println);

        System.out.println("*********Stream rows from CVS file and count***********");

        Stream<String> rows1= Files.lines(Paths.get("D:/Java8Review/src/streams/data.txt"));
        int rowCount=(int)rows1
                .map(x->x.split(","))
                .filter(x->x.length==3)
                .count();
        System.out.println(rowCount+ "rows.");
        rows1.close();

    }
}
