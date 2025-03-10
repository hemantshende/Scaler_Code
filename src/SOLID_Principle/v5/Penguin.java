package SOLID_Principle.v5;

public class Penguin extends Bird {
	
	public Penguin(String name, String type, int noOfWings, boolean canFly) {
		super(name, type, noOfWings, canFly);
	}

	public Penguin() {

	}

	@Override
	public void makeSound() {
		System.out.println("gutur");
	}
	
	
//	@Override
//	public void fly() {
//		//leave it empty
//		//throw exception
//		//or
//		System.out.println("fly low");
//	}
}


