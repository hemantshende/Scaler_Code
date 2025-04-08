package Design_patterns.Adapter;

public class fastTag {
    boolean recharge(YesBankAPI yesBackAPI, int amount){
        if(amount<= yesBackAPI.checkBalance("")){
            System.out.println("Successful");
            return true;
        }
        return false;
    }
}
