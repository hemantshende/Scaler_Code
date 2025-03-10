package SOLID_Principle.v3;

public class Pigeon extends Bird implements Flyable {

    public void fly() {
        System.out.println("fly low");
    }

    public void makeSound() {
        System.out.println("making sound");
    }

}
