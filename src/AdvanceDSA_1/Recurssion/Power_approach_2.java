package AdvanceDSA_1.Recurssion;

public class Power_approach_2 {
    public static int power(int num,int pow){
        if(pow==0){
            return 1;
        }
        if(pow%2==0){ //if pow is even
            return power(num,pow/2)*power(num,pow/2); //2^4==2^2*2^2....4/2
        }else{//if pow is odd
            return power(num,pow/2)*power(num,pow/2) * num;//2^5==(2^2 * 2^2)*2....5/2=2..
        }
    }
    public static void main(String[] args) {
        int num=2;
        int pow=5;
        long ans=power(num,pow);
        System.out.println(ans);
    }
}
