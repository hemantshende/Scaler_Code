package AdvanceDSA_4.DP_1;


//ps-only take 1 or 2 steps..find how many ways to reach at top stair.

import java.util.Arrays;
public class Climbing_Stairs_WithDP {
    public static int ways(int n,int[]dp){
        if(n==0||n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]= ways(n-1,dp)+ways(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=5;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);

        int ans=ways(5,dp);
        System.out.println(ans);
    }
}

//tc=O(N)-->bcoz of DP array
//sc=O(N)-->recursive stack