package SOLID_Principle.v1;

//package SOLID_Bird.v1;

public class Sparrow extends Bird {

    public Sparrow(String name, String type, int noOfWings, boolean canFly) {
        super(name, type, noOfWings, canFly);
    }

    @Override
    public void fly() {
        System.out.println("fly low");
    }

    @Override
    public void makeSound() {
        System.out.println("gutur");
    }
}

