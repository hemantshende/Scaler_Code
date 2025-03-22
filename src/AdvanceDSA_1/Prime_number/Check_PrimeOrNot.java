package AdvanceDSA_1.Prime_number;

public class Check_PrimeOrNot {
    public static void CheckPrime(int n){
        int fact=0;
        for(int i=1; i*i<=n; i++){
            if(n % i==0){
                if(i==n/i){
                    fact+=1;
                }
                else{
                    fact+=2;
                }
            }
        }
        if(fact==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    public static void main(String[] args) {
        int n=15;
        CheckPrime(n);
    }
}
