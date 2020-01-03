package lambda;

public class Greeter {

    //Different interface are needed to create different parameters of lambda expression
    //All different parameters can't we be used in the same parameters
    public void greet(Greeting greeting){

        greeting.perform();
    }
    public void greetNumber(AddNumber addNumber){

       System.out.println(addNumber.perform(3, 4));
    }

    //Main method
    public static void main(String[] args){

       //Creating a new instance of the class, to call the above two methods
        Greeter greeter = new Greeter();

         //Providing an implementation (Inner Class) to the interface, this is basically writing an "Function as value", used in Java 7
         Greeting innerClassGreeting = new Greeting() {
             @Override
             public void perform() {
                 System.out.println("hello innerclass");
             }
         };

        innerClassGreeting.perform();

        //Alternate way to above method is using the lambda expression,
        // so here lambda expression instead of using the "Function as value", it assign whole function to variable
        Greeting lambdaGreeting= ()-> System.out.println("hello lambda");
        lambdaGreeting.perform();  // 1. One way of calling it
        greeter.greet(lambdaGreeting); // 2. Another way of calling it, just putting the value assigned to the greet method


        //Another example of Lambda expression, with parameters
        AddNumber sum=(x,y)-> x+y;
        System.out.println(sum.perform(2, 3)); // 1. One way of calling it
        greeter.greetNumber(sum);  // 2. Another way of calling it, just putting the value assigned to the greet method
         }

}


