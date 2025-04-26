package AdvanceDSA_2.Two_Pointer;

/*
ps==>
    every ele in arr represent height of wall
    find two walls which carry most water
 */

/*
appraoch--
    wall should be as far as possible
    water_accumulated= (j-i) * min(arr[i],arr[j]);

 */
public class Container_With_Most_water {
    public static int maxWaterAccumulated(int[]arr){
        int i=0;
        int j=arr.length-1;
        int ans=0;
        while (i<j){
            int waterAccumulated=(j-i)*Math.min(arr[i],arr[j]);
            ans=Math.max(ans,waterAccumulated);
            if (arr[i]<arr[j]){
                i++;
            }else {
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,5,4,7,3,6,5,4,1,2,100};
        System.out.println(maxWaterAccumulated(arr));
    }
}