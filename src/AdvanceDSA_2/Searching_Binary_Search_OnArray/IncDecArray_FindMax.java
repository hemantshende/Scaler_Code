package AdvanceDSA_2.Searching_Binary_Search_OnArray;


//Ps-given array is continuously incearsng and then dec like(^)
//eg. {1,3,5,10,15,12,6}
//inc 1to 15 and
//dec 15 to 6

//findmax, max==15.....
public class IncDecArray_FindMax {
    public static int findmax(int[] arr){
        int n= arr.length;
        //Edge cases-
        if(arr[0]>arr[1]){
            return arr[0];
        }
        if(arr[n-1]>arr[n-2]){
            return arr[n-1];
        }

        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid] == arr[mid+1] || arr[mid] == arr[mid-1]){
                return -1;
            }
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]){
                return arr[mid];
            }
            if(arr[mid] < arr[mid+1]){
                left=mid+1;
            }else if(arr[mid] > arr[mid+1]){
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,10,15,16,19,19,13,12,6};
        System.out.println(findmax(arr));
    }
}
