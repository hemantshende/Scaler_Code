package Design_patterns.Creational_design_pattern.Singleton.Method2_Eager_Intialization;

public class Singleton {
    private static Singleton Instance=new Singleton(); //private static so that create and return same instance
    private Singleton(){ //private constructor so that no one can create object out of the class.
        System.out.println("Instance created Eager initialization");
    }

    static Singleton getInstance(){ //static..so that no need to create object to call the method
        return Instance;
    }
}