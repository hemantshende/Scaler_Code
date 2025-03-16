package AdvanceDSA_1.Bit_manipulation_1;

public class Count_SetBit {
    public static int count_setBit(int num){
        int count=0;
        for(int i=0;i<32;i++){
            if(check_bit(num,i)){       //calling the check_bit()..
                count++;                //if true
            }
        }
        return count;
    }

    //check ith bit is set or not
    public static boolean check_bit(int num, int ith_bit){
        if(((num >> ith_bit) & 1) ==0){    //we use & operator to check .. | to set.. ^ to change
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        int a=45;
        int bit=2;
        int ans=count_setBit(a);
        System.out.println(ans);
    }
}
