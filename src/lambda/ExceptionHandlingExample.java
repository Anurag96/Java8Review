package lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumber={1,2,3,4};
        int key=0;

        process(someNumber,key,wrapperLambda((v,k)->System.out.println(v / k)));

    }

    private static void process(int[] someNumber, int key, BiConsumer<Integer,Integer> consumer) {
        for(int i: someNumber){
            try {
                consumer.accept(i, key);
            }catch (ArithmeticException e){
                System.out.println("Exception caught in wrapper lamba");
            }
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer){
        return (a,b)-> {consumer.accept(a, b);};
    }
}
