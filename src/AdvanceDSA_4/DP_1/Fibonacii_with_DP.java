package AdvanceDSA_4.DP_1;

import java.util.Arrays;

public class Fibonacii_with_DP {
    public static int fibo(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=-1){ //checking if fibo of that num is already store in dp or not
            return dp[n];  //if already calculated then just return the value directly from dp
        }
        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);  //storing ans in dp array
        return dp[n];
    }
    public static void main(String[] args) {
        int num=10;
        int[] dp=new int[num+1];
        Arrays.fill(dp,-1);

        int ans=fibo(num,dp);
        System.out.println(ans);
    }
}
//here we created dp array
//[-1,-1,-1,-1]
// we calculate fibo of any number and store it in dp

//tc=O(N) -->bcoz of dp array
//sc=O(N) -->recursive stack