package AdvanceDSA_3.LL_Sorting_And_detecting_Loop;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        int[] arr={10,20,30,40,50,60,70,80,90,100};

        for(int val:arr){
            list.add(val);
        }
        System.out.println(list);
    }
}
