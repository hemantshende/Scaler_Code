package Design_patterns.Singleton.Method3_Synchronized;

public class Singleton {
    private static Singleton Instance=new Singleton(); //private static so that create and return same instance
    private Singleton(){ //private constructor so that no one can create object out of the class.
        System.out.println("Instance created by Sync Method");
    }

    public static synchronized Singleton getInstance(){ //static..so that no need to create object to call the method
        if(Instance==null){
            Instance=new Singleton();
        }
        return Instance;
    }
}