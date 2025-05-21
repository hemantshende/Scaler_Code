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

//created Bird Class as abstract class
//created class for every bird and extends bird class...
//they should implement abstract method of bird class..
