package SOLID_Principle.v3;

public class eagle extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    public void makeSound() {
        System.out.println("making sound");
    }

}
