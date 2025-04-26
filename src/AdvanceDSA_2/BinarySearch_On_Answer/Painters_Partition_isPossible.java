package AdvanceDSA_2.BinarySearch_On_Answer;

public class Painters_Partition_isPossible {
    public static boolean isPossible(int[] arr,int timePerUnitlength,int targetTime,int Available_painters){
       int painters=1;
       int timeLeft=targetTime;
       for(int i=0;i<arr.length;i++){
           int walltime=arr[i]*timePerUnitlength;

           if(walltime > targetTime){
               return false;
           }
           if(walltime<=timeLeft){
               timeLeft= timeLeft-walltime;
           }
           else {
               painters++;
               timeLeft= targetTime-walltime;
           }
       }
       if(painters <= Available_painters){
           return true;
       }else{
           return false;
       }
    }
    public static void main(String[] args) {
        int arr[] ={5,3,1,6,9};//wall length
        int time_per_unit_length=2;
        int target_time=15;
        int no_of_Painters=2;

        boolean ans=isPossible(arr,time_per_unit_length,target_time,no_of_Painters);
        System.out.println(ans);
    }
}
