package AdvanceDSA_1.Recurssion;

public class Print_1ToN_asc {
    public static void print(int num){
        if(num==0){
            return;
        }
        print(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num=6;
        print(num);
    }
}
