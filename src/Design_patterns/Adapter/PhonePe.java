package Design_patterns.Adapter;

public class PhonePe {
    private RBIBankAPI bankAPI;
    private phonePeloan phonePeloan;
    private fastTag fastTag;

    PhonePe(RBIBankAPI bankAPI){
        this.bankAPI=bankAPI;
        phonePeloan=new phonePeloan();
        fastTag=new fastTag();
    }

    public int getBalance(){
        return bankAPI.balance("");
    }

    public boolean reachargeFastag(int amount){
        return fastTag.recharge(bankAPI,amount);
    }

    public boolean checkLoanEligibility(int amount){
        return phonePeloan.checkEligibility(bankAPI,amount);
    }
}
