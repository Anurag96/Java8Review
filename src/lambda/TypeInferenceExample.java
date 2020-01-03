package lambda;

public class TypeInferenceExample {

    public static void main(String[] args){

        LambdaExample lengthofString= (s)-> s.length();
        System.out.println("The length again is : "+lengthofString.lengthOfString("hello innerclass")); // 1. One way of calling it.
        printLambda(lengthofString);

    }

    interface LambdaExample{
        int lengthOfString(String s);
    }

    //This can go into method argument
    public static void printLambda(LambdaExample l){

        System.out.println("The length of the string is : "+l.lengthOfString("Hello Anurag"));
    }
}
