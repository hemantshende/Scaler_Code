package AdvanceDSA_1.Recurssion;

public class sum {
    public static int sumof(int num){
        if(num==0){
            return 0;
        }
        return num + sumof(num-1);
    }
    public static void main(String[] args) {
        int num=4;
        int ans=sumof(num);
        System.out.println(ans);
    }
}
