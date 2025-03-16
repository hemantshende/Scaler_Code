package AdvanceDSA_1.Bit_manipulation_1;

public class Unset_if_set {
    public static int Set_bit(int num, int ith_bit){
        if((num & (1<<ith_bit))!=0){    //we use & operator to check .. | to set.. ^ to change
            num=num ^(1<<ith_bit);
            System.out.println("set the bit");
            return num;
        }else{
            System.out.println("already set");
            return num;
        }
    }
    public static void main(String[] args) {
        int num=45;
        int bit=1;
        int ans=Set_bit(num,bit);
        System.out.println(ans);
    }
}
