package AdvanceDSA_2.Searching_Binary_Search_OnArray;

public class Binary_Search {
    public static int find_target(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
//
        while(left<=right){                       //it works on sorted array only
            int mid=(left+right)/2;

            if(target==arr[mid]){
                return mid;
            }else if(target < arr[mid]){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,12,23,45,67,89,90};
        int target=1;
        int ans=find_target(arr,target);
        System.out.println(ans);
    }
}
