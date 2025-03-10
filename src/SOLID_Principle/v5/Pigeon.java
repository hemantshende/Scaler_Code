package SOLID_Principle.v5;

public class Pigeon extends Bird implements Flyable {

	FlyingBehaviour flyLow=new LowFly();
	public void fly() {
		flyLow.doFly();
	}

	public void makeSound() {
		System.out.println("making sound");
	}

}
