package AdvanceDSA_2.BinarySearch_On_Answer;

public class Aggressive_cows_findMaxMinDistTomaintain {
    public static boolean isPossible(int[] arr,int noOfCows,int dist){
        int cow=1;
        int last_pos=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]-last_pos >= dist){
                cow++;
                last_pos=arr[i];
                if(cow==noOfCows){
                    return true;
                }
            }
        }
        return false;
    }

    public static int findMaxMinDist(int[] arr,int noOfCows){
        int n=arr.length;
        int left=1;
        int right=arr[n-1]-arr[0];
        int ans=-1;

        while(left<=right){
            int mid=(left+right)/2;
            boolean check=isPossible(arr,noOfCows,mid);
            if(check==true){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,6,11,14,19,25,30,39,43};
        int cows=4;
        System.out.println(findMaxMinDist(arr,cows));
    }
}
