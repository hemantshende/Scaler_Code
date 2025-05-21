package Design_patterns.Structural_design_pattern.Adapter;

public class YesBankAPIAdapter implements RBIBankAPI{
    private YesBankAPI yesBankAPI=new YesBankAPI();
    @Override
    public int balance(String accountNumber) {
        return yesBankAPI.getbalance("");
    }
}
