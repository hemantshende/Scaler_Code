package SOLID_Principle.v3;


//v3..
// instead of creating abstract class flyable..
// we have created interface of flyable..its behaviour..
// so if another behaviour comes then it is easy to implements that behaviour..
public abstract class Bird {
    private String name;
    private String type;
    int noOfWings;
    boolean canFly;

    public Bird() {
    }

    public Bird(String name, String type, int noOfWings, boolean canFly) {
        this.name = name;
        this.type = type;
        this.noOfWings = noOfWings;
        this.canFly = canFly;
    }

    public void eat() {
        System.out.println("bird is eating");
    }

//	public abstract void fly(); //create problem for penguin

    public abstract void makeSound();

}

