package AdvanceDSA_1.Prime_number;

//check every number from 1-n is prime or not

//steps
//create boolean array of size n
//from 2 to squareRoot of n and mark true to those elements who r divided by any of the element
//return those elements who r marked as false...
public class CheckEveryNumber_oneToNumber {
    public static void primeNumbers(int num){
        boolean[] ans=new boolean[num+1];//every element mark as false by default
//        ans[0]=ans[1]=false;

        for(int i=2; i*i<=num; i++){ //mark non-prime number as true..
            if(ans[i]==false){
                for(int j=i*i; j<=num; j=j+i){
                    ans[j]=true;
                }
            }
        }
        for(int k=0; k<num; k++){
            if(ans[k]==false){
                System.out.println(k);
            }
        }

    }
    public static void main(String[] args) {
        int num=50;
        primeNumbers(num);
    }
}
