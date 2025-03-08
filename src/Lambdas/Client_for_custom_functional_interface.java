package Lambdas;

public class Client_for_custom_functional_interface {
    public static void main(String[] args) {
        Custom_Functional_Interface add=(x,y)->{
            return x+y;
        };
        Custom_Functional_Interface sub=(x,y)->{
            return x-y;
        };
        Custom_Functional_Interface mul=(x,y)->{
            return x*y;
        };
        Custom_Functional_Interface div=(x,y)->{
            return x/y;
        };

        System.out.println(add.operation(4,5));
        System.out.println(sub.operation(4,5));
        System.out.println(mul.operation(4,5));
        System.out.println(div.operation(4,5));

    }
}
