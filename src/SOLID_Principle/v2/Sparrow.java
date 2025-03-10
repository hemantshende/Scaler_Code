package SOLID_Principle.v2;

//package SOLID_Bird.v1;

import SOLID_Principle.v1.Bird;

public class Sparrow extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("fly low");
    }

    @Override
    public void makeSound() {
        System.out.println("gutur");
    }
}

