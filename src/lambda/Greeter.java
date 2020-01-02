package lambda;

public class Greeter {

    public static void main(String[] args){

        AddNumber sum=(x,y)-> x+y;
        System.out.println(sum.Add(2, 3));

         Greeting lambdaGreeting= ()-> System.out.println("hello lambda");
         lambdaGreeting.perform();

         Greeting innerClassGreeting = new Greeting() {
             @Override
             public void perform() {
                 System.out.println("hello innerclass");
             }
         };

        innerClassGreeting.perform();


         }

}


