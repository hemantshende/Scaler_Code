package SOLID_Principle.v3;

public class Vulture extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void makeSound() {
        System.out.println("making sound");
    }

}
