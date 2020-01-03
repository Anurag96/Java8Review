package lambda;

public class TypeInferenceExample {

    public static void main(String[] args){

        LambdaExample lengthofString= (s)-> s.length();
        System.out.println("The length again is : "+lengthofString.lengthOfString("hello innerclass")); // 1. One way of calling it.
        printLambda(lengthofString);

    }

    //The advantage of using an interface is we can use lambda in place of
    // all those anonymous inner class and all those methods signature which accepts the interface,
    // you dont have to rewritte them for the new function path,
    // so this an huge advantage when comes to the backward compatibility
    interface LambdaExample{
        int lengthOfString(String s);
    }

    //This can go into method argument
    public static void printLambda(LambdaExample l){

        System.out.println("The length of the string is : "+l.lengthOfString("Hello Anurag"));
    }
}
