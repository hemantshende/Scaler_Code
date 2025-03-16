package AdvanceDSA_1.Bit_manipulation_1;

public class Find_2_unique_element {
    public static void findTwoUniqueNumber(int[] arr){
        //step 1: take xor of all element
        int xor=0;
        for(int num:arr){
            xor=xor^num;
        }

        //step 2: find first set bit from ans xor...to check use & operator
        int pos=-1;
        for(int i=0;i<32;i++){
            if((xor & (1<<i))!=0){
                pos=i;
            }
            break;
        }

        //step 3: take 2 var s1 and s2...and take seperate xor on the
        // basis of set bit
        int s1=0, s2=0;
        for(int i=0; i<arr.length;i++){
            if((arr[i] & (1<<pos))!=0){
                s1=s1^arr[i];
            }else{
                s2=s2^arr[i];
            }
        }

        //print s1 and s2
        System.out.println(s1+"  "+s2);

    }
    public static void main(String[] args) {
        int[] arr={10,8,8,9,12,9,6,11,10,6,12,17};
        findTwoUniqueNumber(arr);
    }
}
