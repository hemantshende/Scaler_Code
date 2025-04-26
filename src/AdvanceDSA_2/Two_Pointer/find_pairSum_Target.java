package AdvanceDSA_2.Two_Pointer;


//NOTE
// array must be sorted ...if not then use hashset
/*
problem statement
    find pair of sum==target..
    arr[i]+arr[j]==taget..
*/
public class find_pairSum_Target {
    public static boolean isPresent(int[] arr,int target){
        int i=0;
        int j= arr.length-1;

        while(i<j){
            if(arr[i]+arr[j]==target){
                return true;
            } else if (arr[i]+arr[j] >target) {
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={-5,-2,1,5,10,11,15};
        int target=120;
        System.out.println(isPresent(arr,target));
    }
}
