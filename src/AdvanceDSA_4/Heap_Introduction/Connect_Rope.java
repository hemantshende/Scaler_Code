package AdvanceDSA_4.Heap_Introduction;



//problem statement
// You can connect two ropes together at a time
// cost of connecting two rope
// sum of length of ropes
// find the minimum cost of connecting all the ropes
//[2,5,2,6,3]->cost to connect that rope..

//idea-1
//sort the array and add two smallest rope ..but everytime we need to sort array.

import java.util.PriorityQueue;

//idea-2
//use min-heap...priorityQueue internally implemented min-heap
public class Connect_Rope {
    public static long calculateCost(int[] arr){
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add((long) ele);
        }
        long cost=0;
        while(pq.size()>1){
            long a=pq.poll();
            long b=pq.poll();

            pq.add(a+b);
            cost += a+b;
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr={2,5,2,6,3};
        long ans=calculateCost(arr);
        System.out.println(ans);
    }
}
