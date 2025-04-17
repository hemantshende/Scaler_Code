package AdvanceDSA_2.BinarySearch_On_Problems;

public class Sorted_Rotated_array_findTarget {

    public static int findTarget(int[] arr, int target){
        int n= arr.length;
        int left=0;
        int right=n-1;
        int mid=-1;

        while(left<=right){
            mid=(left+right)/2;
            if(target >= arr[0]){ //target in left side
                if(arr[mid] < arr[0]){ //mid in right side
                    right=mid-1;
                }else{   //mid is also in left side
                    if(arr[mid]<target){
                        left=mid+1;
                    }else{
                        right=mid-1;
                    }
                }
            }else{//target in right side
                if(arr[mid]>=arr[0]){
                    left=mid+1;
                }else{
                    if(arr[mid]>target){
                        right=mid-1;
                    }else{
                        left=mid+1;
                    }
                }
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int [] arr={10,11,12,13,1,2,3,4,5,6,7,8,9};
        int target=13;

        int ans=findTarget(arr, target);
        System.out.println(ans);
    }
}
