package AdvanceDSA_2.Sorting_1;

import java.util.Arrays;

public class count_sort_positiveNumbersOnly {
    public static void countSort(int[] arr){
        int[] freqArr=new int[10];
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            freqArr[num]++;
        }
        int idx=0;
        for(int i=0; i<=9; i++){
            for(int j=1;j<=freqArr[i];j++){
                arr[idx]=i;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={9,1,2,5,4,2,1,2,5,8};
        countSort(arr);
    }
}
