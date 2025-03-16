package AdvanceDSA_1.Recurssion;

public class factorial {
    public static int findFact(int num){
        if(num==1){
            return 1;
        }
        return num * findFact(num-1);
    }
    public static void main(String[] args) {
        int ans=findFact(5);
        System.out.println(ans);
    }
}
