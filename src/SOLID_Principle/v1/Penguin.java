package SOLID_Principle.v1;
//package SOLID_Bird.v1;

public class Penguin extends Bird {

    public Penguin(String name, String type, int noOfWings, boolean canFly) {
        super(name, type, noOfWings, canFly);
    }

    @Override
    public void makeSound() {
        System.out.println("gutur");
    }


    @Override
    public void fly() {
        //leave it empty
        //throw exception
        //or
        System.out.println("Can not Fly");
    }
}



