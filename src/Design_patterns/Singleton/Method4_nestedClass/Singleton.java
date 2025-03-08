package Design_patterns.Singleton.Method4_nestedClass;

public class Singleton {//private static so that create and return same instance
    private Singleton(){ //private constructor so that no one can create object out of the class
        System.out.println("Instance created by Nested-Class Method");
    }

    private static class SingltonHelper{ //nested-class to provide Instance
        private static final Singleton Instance=new Singleton();
    }

    public static synchronized Singleton getInstance(){ //static..so that no need to create object to call the method
        return SingltonHelper.Instance;
    }
}