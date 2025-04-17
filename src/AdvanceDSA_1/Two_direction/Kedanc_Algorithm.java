package AdvanceDSA_1.Two_direction;

//this is to get max subarray sum ...
//[5 6 7 -3 2 -10 -12 8 12 -4 7 -2]...max sub sum is 23...index 7-10.

//add element store max sum in ans
//if sum becomes -ve then set it to 0

public class Kedanc_Algorithm {

    public static int maxSubSum(int [] arr){
        int ans=arr[0];
        int sum=0;
        for(int i=0; i< arr.length;i++){
            sum=sum+arr[i];
            ans=Math.max(sum,ans);
            if(sum < 0){
                sum=0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr= {5, 6 ,7 ,-3, 2, -10, -12, 8, 12, -4, 7, -2};
        int ans=maxSubSum(arr);
        System.out.println(ans);
    }
}
