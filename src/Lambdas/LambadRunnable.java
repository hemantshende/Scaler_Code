package Lambdas;

public class LambadRunnable {
    public static void main(String[] args) {
        //lambdas work with functional interface only
        //func interface menas the interface with only one abstract method
        //eg-runnable,collable, comparator,etc
        Runnable runnable=()->{
            System.out.println("Hello world");
        };

        Thread t=new Thread(runnable);
        t.start();
    }
}
