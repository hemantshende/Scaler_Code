package AdvanceDSA_2.Sorting_1;

import java.util.Arrays;

public class Merge_two_sorted_array {
    public static int[] merge(int[] a, int[] b){
        int n=a.length;
        int m=b.length;
        int[] ans=new int[n+m];

        int i=0;//representing first arr
        int j=0;//representing second arr
        int k=0;//representing ans arr...

        while(i<n && j<m){
            if(a[i]<=b[j]){
                ans[k]=a[i];
                i++;
                k++;

            }else{
                ans[k]=b[j];
                j++;
                k++;

            }
        }
        while(i<n){
            ans[k]=a[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=b[j];
            j++;
            k++;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr1={2,6,8,9,12};
        int[] arr2={3,6,8,12,23,56,68};

        int[] ans=merge(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
