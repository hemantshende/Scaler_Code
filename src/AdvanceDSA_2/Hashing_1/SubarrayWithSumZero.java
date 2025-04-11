package AdvanceDSA_2.Hashing_1;

import java.util.HashMap;
import java.util.Map;

//steps
//create psum[] and
//check if any number is repeating in psum[]
//if yes-->true ... no-false
public class SubarrayWithSumZero {
    public static boolean Check_Subarray_with_sumZero(int[] arr){
        int[] psum= new int[arr.length];
        psum[0]=arr[0];
        for(int i=1; i< arr.length;i++){
            psum[i]=psum[i-1]+arr[i];
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int i:psum){
            if(i==0){  //single element is also a subaaray [0]
                return true;
            }
            if(map.containsKey(i)){
                return true;
            }else{
                map.put(i,1);
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        int[] arr={2,2,1,-3,4,3,1,-2,-3,2};
        int[] arr={1,1,1,1};

        boolean ans=Check_Subarray_with_sumZero(arr);
        System.out.println(ans);

    }
}
