package Design_patterns.Adapter;

public class phonePeloan {
    boolean checkEligibility(YesBankAPI yesBackAPI, int amount){
        if(amount>= .2*yesBackAPI.checkBalance("")){
            System.out.println("eligible");
            return true;
        }
        return false;
    }
}
