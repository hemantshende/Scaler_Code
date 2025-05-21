package Design_patterns.Creational_design_pattern.Singleton.Method1_Lazy_Intialization;

public class Singleton {
    private static Singleton Instance=null; //private static so that create and return same instance


    private Singleton(){ //private constructor so that no one can create object out of the class.
        System.out.println("Instance created with lazy initialization");
    }

    static Singleton getInstance(){ //static..so that no need to create object to call the method
        if(Instance==null){
            Instance=new Singleton(); //Lazy Initialization
            return Instance;
        }else{
            return Instance;
        }
    }
}
