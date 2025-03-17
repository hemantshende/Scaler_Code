package AdvanceDSA_1.Recurssion;

public class Power_approach_3_FastPower {
    public static int Fast_power(int num,int pow){
        if(pow==0){
            return 1;
        }
        int p=Fast_power(num,pow/2);
        if(pow%2==0){
            return p*p;
        }else{
            return p*p*num;
        }
    }
    public static void main(String[] args) {
        int num=2;
        int pow=5;
        long ans=Fast_power(num,pow);
        System.out.println(ans);
    }
}
