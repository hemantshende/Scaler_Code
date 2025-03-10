package SOLID_Principle.v2;

//package SOLID_Bird.v1;

import SOLID_Principle.v1.Bird;

public class eagle extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void makeSound() {
        System.out.println("making sound");
    }

}

