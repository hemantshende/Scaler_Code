package AdvanceDSA_1.One_direction;

//ps-> innitially all elemnts are 0..[0 0 0 0 0 0].
// given index and value to add that value to that index..
// its 2d array
//idx  val
// 3    4
// 1    3
// 4    -2
//add that element to index to the last ele of arr
//return final arr as ans

import java.util.Arrays;

public class Pre_Sum_problem {
    public static void solution(int[]arr, int[][] query){
        int N=arr.length;
        int Q=query.length;
        for(int i=0;i<Q;i++){
            int idx=query[i][0];
            int val=query[i][1];
            arr[idx]=+val;
        }
        for(int i=1;i<N;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr=new int[10];
        int[][] query= {
                {3,4},
                {1,3},
                {4,-2}
        };
        System.out.println("query");
        System.out.println(Arrays.deepToString(query));
        solution(arr,query);
    }
}
