package Design_patterns.Adapter;

public class phonePeloan {
    boolean checkEligibility(RBIBankAPI bankAPI, int amount){
        if(amount>= .2*bankAPI.balance("")){
            System.out.println("eligible");
            return true;
        }
        return false;
    }
}
