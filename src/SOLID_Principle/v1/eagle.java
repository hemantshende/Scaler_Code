package SOLID_Principle.v1;

//package SOLID_Bird.v1;

public class eagle extends Bird{

    public eagle(String name, String type, int noOfWings, boolean canFly) {
        super(name, type, noOfWings, canFly);
    }

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void makeSound() {
        System.out.println("making sound");
    }

}

