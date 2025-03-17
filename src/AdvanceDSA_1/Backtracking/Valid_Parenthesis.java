package AdvanceDSA_1.Backtracking;

public class Valid_Parenthesis {
    public static void validparenthesis(int num){
        if(num%2!=0){
            System.out.println("Enter Even number to get valid parenthesis..!!!");
        }else {
            int openig = 0;
            int closing = 0;
            String str = "";
            validparenthesisHelper(0, 0, str, num);
        }
    }

    private static void validparenthesisHelper(int opening, int closing, String str, int num) {
        if(str.length()==num){//terminating condition
            System.out.println(str);
            return;
        }
        if(opening < num/2){//checking opening braces must be half of the num...
            validparenthesisHelper(opening+1,closing,str+"(",num);
        }
        if(opening > closing){//closing should apply if opening is greater than closing
            validparenthesisHelper(opening,closing+1,str+")",num);
        }
    }

    public static void main(String[] args) {
        int num=8;
        validparenthesis(num);
    }
}
