package AdvanceDSA_2.Hashing_1;

import java.util.HashSet;
import java.util.Set;

public class Count_Dist_Element {
    public static int countDistElement(int[] arr ){
//        int ans=-1;
        Set<Integer> set=new HashSet<>(); // duplicates not allowed
        for(int ele:arr){
            set.add(ele);
        }
        return set.size();//count of dist element
    }
    public static void main(String[] args) {
//        int[] arr={3,5,6,4,5}; //ans=4...3,5,6,4
//        int[] arr={3,3,3}; // ans=1...3
        int[] arr={1,1,1,2,2}; //ans=2....1,2

        int ans=countDistElement(arr);
        System.out.println(ans);
    }
}
