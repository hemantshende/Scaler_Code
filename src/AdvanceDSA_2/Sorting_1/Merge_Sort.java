package AdvanceDSA_2.Sorting_1;

import java.util.Arrays;

public class Merge_Sort {
    public static void mergeSort(int[] arr,int low, int high){
        if(low==high){
            return;
        }
        int mid=(low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge_two_sorted_array(arr,low,mid,high);
    }

    private static void merge_two_sorted_array(int[] arr, int low, int mid,int high) {
        int i=low;
        int j=mid+1;
        int k=0;

        int[] ans=new int[high-low+1];

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                ans[k]=arr[i];
                k++;
                i++;
            }else{
                ans[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            ans[k]=arr[i];
            k++;
            i++;
        }
        while(j<=high){
            ans[k]=arr[j];
            k++;
            j++;
        }

        for(int l= low;l<=high; l++){
            arr[l]=ans[l-low];//..............very important...
        }
    }

    public static void main(String[] args) {
        int[] arr={2,8,6,5,9,15,2,34,56,23,5,9,};
        int low=0;
        int high=arr.length-1;
        mergeSort(arr,low,high );
        System.out.println(Arrays.toString(arr));  // Print sorted array
    }
}
