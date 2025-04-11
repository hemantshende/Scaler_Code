package AdvanceDSA_1.Bit_manipulation_1;

import java.util.HashMap;
import java.util.Map;

public class Find_unique_element {
    public static int uniqueElement(int[] arr){    //method 1 using bit-manipulation
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
    public static int unique(int[]arr){     //method2-using hashmap
        int ans=0;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int num: arr){
            if (hm.containsKey(num)) {
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }
        for(int key:hm.keySet()){
            if(hm.get(key)==1){
                return key;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,15,6,5,3,4,2};
        System.out.println(uniqueElement(arr));//by bit-manipulation tc-O(N) sc-O(1)
        System.out.println(unique(arr));//by hashmap...tc-O(N) sc-O(N)
    }
}
