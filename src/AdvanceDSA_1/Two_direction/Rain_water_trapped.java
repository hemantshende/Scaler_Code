package AdvanceDSA_1.Two_direction;

//for every element we need to calculate lmax and rmax
//then take min{lmax,rmax) and sunstract the height of the biulding
//we add all trapped water and return it

//for this we need to use pre-sum tech to create lmax[] and rmax[]
//then we will get lmax and rmax for every ele of array

import java.util.Arrays;

public class Rain_water_trapped {
    public static int waterTrapped(int[] arr){
        int N= arr.length;
        int[] lmax=new int[N];
        int[] rmax=new int[N];

        //create lmax []
        lmax[0]=arr[0];
        for(int i=1; i<N;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        System.out.println("lmax[]:"+ Arrays.toString(lmax));

        //create rmax[]
        rmax[N-1]=arr[N-1];
        for(int i=N-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        System.out.println("rmax[]:"+ Arrays.toString(rmax));


        //calculate water trapped on each building
        int ans=0;
        int[] result=new int[N];
        for(int i=0;i<N;i++){
            ans+=Math.min(lmax[i],rmax[i])-arr[i];
            result[i]=Math.min(lmax[i],rmax[i])-arr[i];
        }
        System.out.println("result:"+Arrays.toString(result));
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,1,3,2,1,2,4,3,2,1,3,1};
        System.out.println(Arrays.toString(arr));
        System.out.println("Water trapped:"+waterTrapped(arr));
    }
}
