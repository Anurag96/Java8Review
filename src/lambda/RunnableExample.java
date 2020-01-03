package lambda;

public class RunnableExample {

    public static  void main(String[] args){

         //This is an classic example of using the anonymous inner class,
        //Runnable is an interface, which has a method call run(), so in
        //order to create a new thread, you have to create a new instance of runnable
        //and use that instance to create a new thread

        Thread myThread=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Printed inside Runnable,this is anonymous inner class");
            }
        });

        myThread.run();

        //Since runnable is an interface, which has just one method run()
        //It work just as well as with Lambda, so use lambda to create a new runnable
        //*Note :  Remember whenever you are using lambda it has to be interface with one abstract method

        Thread myLambdaThread=new Thread(()->  System.out.println("Printed inside Runnable,this is anonymous inner class"));
        myLambdaThread.run();
    }
}
