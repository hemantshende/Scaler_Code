package Design_patterns.Structural_design_pattern.Adapter;

public class fastTag {
    boolean recharge(RBIBankAPI bankAPI, int amount){
        if(amount<= bankAPI.balance("")){
            System.out.println("Successful");
            return true;
        }
        return false;
    }
}
