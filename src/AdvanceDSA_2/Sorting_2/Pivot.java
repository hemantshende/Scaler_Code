package AdvanceDSA_2.Sorting_2;

import java.util.Arrays;

//question- first element is pivot element
//solve arr such that keep smaller element left side of pivot
//and bigger element on the right side of pivot

//solution
//sort array.. except pivot element...using left and right pointer
//and then swap pivot and rigth pointer..
public class Pivot {
    public static int[] solve(int[] arr){
        int pivot=arr[0];
        int left=1;
        int right= arr.length-1;

        while(left<=right){
            if(arr[left]<=pivot){
                left++;
            } else if (arr[right]>pivot) {
                right--;
            }else {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }

        //finally swap pivot to the arr[right]
        int temp=arr[right];
        arr[right]=arr[0];
        arr[0]=temp;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr={45,26,95,17,77,31,44,49,55,20};

        int[]ans=solve(arr);
        System.out.println(Arrays.toString(ans));
    }
}
