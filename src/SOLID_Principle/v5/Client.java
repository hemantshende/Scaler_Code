package SOLID_Principle.v5;

public class Client {
    public static void main(String[] args) {
        Sparrow sparrow=new Sparrow();
        sparrow.makeSound();
        sparrow.fly();

        Bird penguin= new Penguin();
        penguin.makeSound();

        Pigeon pigeon =new Pigeon();
        pigeon.fly();

    }
}
