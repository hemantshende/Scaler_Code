package Design_patterns.Singleton.Method1_Lazy_Intialization;


public class Client {
    public static void main(String[] args) {
        Singleton obj1= Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();
        Singleton obj4= Singleton.getInstance();
        Singleton obj5= Singleton.getInstance();
        Singleton obj6= Singleton.getInstance();
        Singleton obj7= Singleton.getInstance();
        Singleton obj8= Singleton.getInstance();


        System.out.println(obj2==obj8); //checking same obj created or diff...
    }
}