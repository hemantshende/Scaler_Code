package SOLID_Principle.v1;


public abstract class Bird {
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

    public abstract void fly() ;

    public abstract void makeSound();
}

//createdd bird class as abstract class
//created class for every bird and extends bird class...
//they should impliment abstract method of bird class..
