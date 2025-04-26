package AdvanceDSA_2.BinarySearch_On_Answer;

public class Aggressive_cows_isPossible {
    public static boolean isPossible(int[] arr, int noOfCows,int dist){
        int cow=1;
        int last_pos=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-last_pos >= dist){
                cow++;
                last_pos=arr[i];
                if(cow==noOfCows){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,6,11,14,19,25,30,39,43};
        int cows=4;
        int dist=20;

        System.out.println(isPossible(arr,cows,dist));

    }
}
