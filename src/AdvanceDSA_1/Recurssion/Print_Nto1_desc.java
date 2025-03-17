package AdvanceDSA_1.Recurssion;

public class Print_Nto1_desc {
    public static void print(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        print(num-1);
    }
    public static void main(String[] args) {
        int num=6;
        print(num);
    }
}
