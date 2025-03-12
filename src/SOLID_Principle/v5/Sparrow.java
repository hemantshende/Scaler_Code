package SOLID_Principle.v5;

public class Sparrow extends Bird implements Flyable {
	
	private FlyingBehaviour flyLow=new LowFly();
	public void fly() {
		flyLow.doFly();
	}

	public void makeSound() {
		System.out.println("gutur");
	}

}
