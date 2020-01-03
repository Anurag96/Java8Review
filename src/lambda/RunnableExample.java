package lambda;

public class RunnableExample {

    public static  void main(String[] args){

        Thread myThread=new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Printed inside Runnable,this is anonymous inner class");
            }
        });

        myThread.run();

        Thread myLambdaThread=new Thread(()->  System.out.println("Printed inside Runnable,this is anonymous inner class"));
        myLambdaThread.run();
    }
}
