package SOLID_Principle.v0;

//bird class is more generic
//handling all the responsibility of all bird types
//breaking single responsibility principle

public class Bird {
    private String name;
    private String type;
    int noOfWings;
    boolean canFly;

    public Bird(String name, String type, int noOfWings, boolean canFly) {
        this.name = name;
        this.type = type;
        this.noOfWings = noOfWings;
        this.canFly = canFly;
    }

    public void eat() {
        System.out.println("bird is eating");
    }

    public void fly() {

    }

    public void makeSound() {
        if(type.equals("sparrow")) {
            System.out.println("gutur gutur");
        }
        else if(type.equals("peacock")) {
            System.out.println("meeooo");
        }else if(type.equals("crow")) {
            System.out.println("cow cow");
        }
    }
}

