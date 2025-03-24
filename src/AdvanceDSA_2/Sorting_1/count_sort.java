package AdvanceDSA_2.Sorting_1;

import java.util.Arrays;

public class count_sort {
    public static void countSort(int[]arr){
        int smallest=arr[0];
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            smallest=Math.min(smallest,arr[i]);
            largest=Math.max(largest,arr[i]);
        }
        int range=largest-smallest+1;//....calculate the range of the freq array.
        int[] freq=new int[range];  //creating the freq array of length==range..

        for(int i=0; i< arr.length;i++){
            int num=arr[i];
            freq[num-smallest]++;// -5-(-5)=0... freq[0]
        }

        int idx=0;
        for(int i=0;i<freq.length;i++){
            for(int j=1;j<=freq[i];j++){
                arr[idx]=i+smallest; //.........i=0..smallest=-5..i+smallest==0+(-5)=-5;
                idx++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={-2,3,8,3,-5,7,8,-2};
        countSort(arr);
    }
}
