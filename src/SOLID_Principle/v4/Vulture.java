package SOLID_Principle.v4;

public class Vulture extends Bird implements Flyable{

	HighFly highfly=new HighFly();//dependancy inversion
	
	@Override
	public void fly() {
		highfly.flyNAAA();
	}

	@Override
	public void makeSound() {
		System.out.println("making sound");
	}

}
