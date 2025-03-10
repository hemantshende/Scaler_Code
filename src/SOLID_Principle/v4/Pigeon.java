package SOLID_Principle.v4;

public class Pigeon extends Bird implements Flyable {

	FlyLow flyLow=new FlyLow();      //Dependency inversion
	public void fly() {
		flyLow.doFly();
	}

	public void makeSound() {
		System.out.println("making sound");
	}
}
//did changes in pigeon class