package SOLID_Principle.v5;

public class Vulture extends Bird implements Flyable{

	FlyingBehaviour highfly=new HighFly();//dependancy inversion
	
	@Override
	public void fly() {
		highfly.doFly();
	}

	@Override
	public void makeSound() {
		System.out.println("making sound");
	}

}
