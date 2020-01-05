package methodreference;

public class MethodReferenceExample  {
    public static void main(String[] args) {
    //this is the example of lambda expression
        //Thread thread = new Thread(()->printMsg());

        //this  is an example of method reference
        Thread thread=new Thread(MethodReferenceExample :: printMsg); //()->method()

    thread.run();
    }

    public static void printMsg(){
        System.out.println("Hello");
    }

}
