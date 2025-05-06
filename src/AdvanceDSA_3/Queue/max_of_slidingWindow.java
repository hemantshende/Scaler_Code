package AdvanceDSA_3.Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class max_of_slidingWindow {
    public static void maxOfSlidingWindow(int[] arr,int windowSize){
        Deque<Integer> dq=new ArrayDeque<>();
        List<Integer> ans=new ArrayList<>();

        for(int i=0;i<windowSize;i++){
            while(dq.size()>0 && arr[dq.getLast()]<arr[i]){
                dq.removeLast();
            }
            dq.offer(i);
        }

        ans.add(arr[dq.getFirst()]);

        for(int i=windowSize;i< arr.length;i++){
            while(dq.size()>0 && arr[dq.getLast()]<arr[i]){
                dq.removeLast();
            }
            dq.offer(i);

            if(dq.getFirst() <= i-windowSize){
                dq.removeFirst();
            }

            ans.add(arr[dq.getFirst()]);
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr={3,2,9,4,-1,16,1,7,-2,5,-5};
        maxOfSlidingWindow(arr,4);
    }
}
