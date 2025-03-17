package AdvanceDSA_1.Recurssion;

public class Power_approach_1 {
    public static int power(int num,int pow){
        if(pow==0){
            return 1;
        }
        return power(num,pow-1)*num;
    }
    public static void main(String[] args) {
        int num=2;
        int pow=5;
        long ans=power(num,pow);
        System.out.println(ans);
    }
}
