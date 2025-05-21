package Design_patterns.Structural_design_pattern.Adapter;

public class RBIBankAdapterFactory {
    public static RBIBankAPI getbankApiAdapter(String bankName){
        RBIBankAPI bankAPI = null;
        if(bankName.equals("icici")){
            bankAPI=new ICICIBankAdapter();
        } else if (bankName.equals("yes")){
            bankAPI =new YesBankAPIAdapter();
        }
        return bankAPI;
    }
}
