package AdvanceDSA_4.DP_1;


//ps-only take 1 or 2 steps..find how many ways to reach at top stair.

public class Climbing_Stairs {
    public static int ways(int n){
        if(n==0||n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return ways(n-1)+ways(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        int ans=ways(5);
        System.out.println(ans);
    }
}

//tc=O(2^N)
//sc=O(N)-->recursive stack