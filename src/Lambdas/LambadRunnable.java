package Lambdas;

public class LambadRunnable {
    public static void main(String[] args) {
        Runnable runnable=()->{
            System.out.println("Hello world");
        };

        Thread t=new Thread(runnable);
        t.start();
    }
}
