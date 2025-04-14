package AdvanceDSA_2.Sorting_2;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int[] arr, int left, int right){
        if(left>=right){
            return;
        }
        int pivot=partition(arr, left, right); //it returns the index of pivot point
        sort(arr,left,pivot-1);
        sort(arr, pivot+1, right);
    }

    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int left=low+1;
        int right=high;

        while(left<=right){
            if(arr[left]<pivot){
                left++;
            }else if(arr[right] > pivot){
                right--;
            }else {
                //swap
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        //finally swap right with pivot
        int temp=arr[right];
        arr[right]=arr[low];
        arr[low]=temp;

        return right;
    }
    public static void main(String[] args) {
        System.out.println("aaaaa");
        int[] arr = {5, 7, 3, 1, 4, 9, 3, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}