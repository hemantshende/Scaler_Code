package AdvanceDSA_1.Bit_manipulation_1;

public class Check_ith_bit_setOrNot {
    public static void check_bit(int num, int ith_bit){
        if((num & (1<< ith_bit)) ==0){    //we use & operator to check .. | to set.. ^ to change
            System.out.println("ith bit is unset");
        }else{
            System.out.println("ith bit is set");
        }
    }
    public static void main(String[] args) {
        int a=45;
        int bit=0;
        check_bit(a,bit);

    }
}
