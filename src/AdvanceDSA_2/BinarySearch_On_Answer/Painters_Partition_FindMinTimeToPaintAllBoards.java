package AdvanceDSA_2.BinarySearch_On_Answer;

public class Painters_Partition_FindMinTimeToPaintAllBoards {

    public static boolean isPossiblie(int[] arr,int timePerUnitLength,int targetTime,int noOfpainters){
        int painters=1;
        int timeLeft=targetTime;
        for(int i=0;i<arr.length;i++){
            int walltime=arr[i]*timePerUnitLength;

            if(walltime> targetTime){
                return false;
            }
            if(walltime<=timeLeft){
                timeLeft-=walltime;
            }else{
                painters++;
                timeLeft=targetTime-walltime;
            }
        }
        if(painters<=noOfpainters){
            return true;
        }else{
            return false;
        }
    }

    public static int findMinTimeToPaintAllBorads(int[] arr,int timePerUnitLength,int noOfpainters){
        //search space
        //left=maxElement*timePerUnitLength
        //rigth=sumOfAllElemetnt * timePerUnitLength
        //so we need to find max element and sum of all element
        int max=arr[0];
        int sum=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum=sum+arr[i];
        }

        int left=max*timePerUnitLength;
        int right=sum*timePerUnitLength;
        int ans=-1;

        while(left<=right){
            int mid=(left+right)/2;
            boolean check=isPossiblie(arr, timePerUnitLength, mid, noOfpainters);
            if(check==true){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] ={5,3,1,6,9};//wall length
        int time_per_unit_length=3;
//        int target_time=15;
        int no_of_Painters=1;

        int ans=findMinTimeToPaintAllBorads(arr,time_per_unit_length,no_of_Painters);
        System.out.println(ans);
    }
}
