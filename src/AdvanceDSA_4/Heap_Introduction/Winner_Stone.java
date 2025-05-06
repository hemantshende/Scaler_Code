package AdvanceDSA_4.Heap_Introduction;


/*Problem Statement
 Each element of given array is weight of stone
 every time pick two heaviest stone and smash them.
 eg. 7 and 5...if smash then 7-5=2 ..stone of size 2 remains..
 finally one stone remains ...
 return its weight..*/

//approach1
// sort array evertime pick 2 heaviest and put the result of it in array..
// do till only one stone left

//approach 2
// use max-heap....priorityQueue(reverse.order)..implemented max-heap internally
//pick two everytime..and add ther result in max-heap

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Winner_Stone {
    public static int findWinner(int[] arr ){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:arr){
            pq.offer(stone);
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(b<a){
                pq.offer(a-b);
            }
        }
        if(pq.size()==1){
            return pq.poll();
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,5,7,1,4,2,8,6,10,2,53};
        int winner=findWinner(arr);
        System.out.println(winner);
    }
}

//
