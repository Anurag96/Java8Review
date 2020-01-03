package lambda;

public class Greeter {

    //Different interface are needed to create different parameters of lambda expression
    //All different parameters can't we be used in the same parameters
    public void greet(NoParameter greeting) {

        greeting.perform();
    }

    public void greetNumber(TwoParameter twoParameter) {

        System.out.println("The result of two operation is : "+twoParameter.perform(4, 2));
    }

    public void greetString(OneParameter oneParameter) {

        System.out.println("The length of the string is : "+oneParameter.perform("Greeting"));
    }
    //Main method
    public static void main(String[] args) {

        //Creating a new instance of the class, to call the above two methods
        Greeter greeter = new Greeter();

        //Providing an inline implementation (Inner Class) to the interface, this is basically writing an "Function as value", used in Java 7
        NoParameter innerClassGreeting = new NoParameter() {
            @Override
            public void perform() {
                System.out.println("hello innerclass");
            }
        };

        innerClassGreeting.perform();

        //Alternate way to above method is using the lambda expression,
        // so here lambda expression instead of using the "Function as value", it assign whole function to variable
        NoParameter lambdaGreeting = () -> System.out.println("hello lambda"); //*Note : the name of the type should be the same as the interface
        lambdaGreeting.perform();  // 1. One way of calling it
        greeter.greet(lambdaGreeting); // 2. Another way of calling it, just putting the value assigned to the greet method


        //Another example of Lambda expression, with parameters doing addition
        TwoParameter sum = (x, y) -> x + y;
        System.out.println(sum.perform(2, 3)); // 1. One way of calling it
        greeter.greetNumber(sum);  // 2. Another way of calling it, just putting the value assigned to the greet method

        //Another example of Lambda expression, with parameters doing division
        TwoParameter divide = (x, y) -> {
            if (y == 0)
                return 0;
            return x / y;
        };
        greeter.greetNumber(divide);

        //Another example of Lambda expression, with parameters finding length of string
        OneParameter stringlength=(s)->s.length();
        System.out.println("The length again is : "+stringlength.perform("hello innerclass")); // 1. One way of calling it
        greeter.greetString(stringlength);  // 2. Another way of calling it, just putting the value assigned to the greet method

      }


}


