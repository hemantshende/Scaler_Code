package AdvanceDSA_2.Hashing_1;

import java.util.HashMap;
import java.util.Map;

public class Freq_of_Element_in_Given_Array {
    public static void countFrequency(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                map.put(arr[i],val+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        int[] arr={2,6,3,8,2,8,2,3,8,10,6};
        countFrequency(arr);
    }
}
