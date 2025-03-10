package SOLID_Principle.v5;

public class Client {
    public static void main(String[] args) {
        Bird sparrow=new Sparrow();
        sparrow.makeSound();
//        sparrow.f

        Bird penguin= new Penguin();
        penguin.makeSound();

        Bird pigeon =new Pigeon();
        ((Pigeon) pigeon).fly();
    }
}
