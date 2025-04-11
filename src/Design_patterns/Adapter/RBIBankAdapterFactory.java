package Design_patterns.Adapter;

import java.util.Scanner;

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
