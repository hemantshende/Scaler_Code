package SOLID_Principle.v5;

public class eagle extends Bird implements Flyable{

	FlyingBehaviour highfly=new HighFly();
	
	@Override
	public void fly() {
		highfly.doFly();
	}

	public void makeSound() {
		System.out.println("making sound");
	}

}
