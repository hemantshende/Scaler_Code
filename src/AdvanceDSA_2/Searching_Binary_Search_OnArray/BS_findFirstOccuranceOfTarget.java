package AdvanceDSA_2.Searching_Binary_Search_OnArray;

public class BS_findFirstOccuranceOfTarget {
    private static int find_First_occurance_target(int[] arr, int target) {
        int left=0;
        int right= arr.length-1;
        int ans=-1;
        while(left <=right){
            int mid=(left+right)/2;
            if(target==arr[mid]){
                ans=mid;
                right=mid-1; //this is for first-occurance of target...
            } else if (target < arr[mid]){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return ans; //if not found -1...
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,6,6,6,7,8,12,23,45,67,89,90};
        int target=6;
        int ans=find_First_occurance_target(arr,target);
        System.out.println(ans);
    }
}
