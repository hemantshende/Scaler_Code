package AdvanceDSA_4.DP_1;

public class Fibonacii {
    public int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Fibonacii fibo=new Fibonacii();
        int ans=fibo.fibo(10);
        System.out.println(ans);
    }
}

//tc=O(2^N)   sc=O(N)
