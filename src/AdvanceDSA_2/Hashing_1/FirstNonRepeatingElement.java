package AdvanceDSA_2.Hashing_1;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
    public static int First_NonRepeating_Element(int []arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0; i< arr.length;i++){
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                map.put(arr[i],val+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int i=0; i< arr.length;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int[] arr={1,2,3,1,2,3};
        int[] arr={4,3,3,2,5,6,4,5};
//        int[] arr={2,6,8,4,7,2,9};

        int ans=First_NonRepeating_Element(arr);
        System.out.println(ans);
    }
}
