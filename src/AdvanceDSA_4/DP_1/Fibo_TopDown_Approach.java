package AdvanceDSA_4.DP_1;

public class Fibo_TopDown_Approach {
    public static int fibo(int n){
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        int num=10;
        System.out.println(fibo(10));
    }
}
