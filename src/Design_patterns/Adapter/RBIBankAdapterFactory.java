package Design_patterns.Adapter;

import java.util.Scanner;

public class RBIBankAdapterFactory {
    public static RBIBankAPI getbankApiAdapter(String bankName){

        RBIBankAPI bankAPI = null;
        if(bankName.equals("ICICI")){
            bankAPI=new ICICIBankAdapter();
        } else if (bankName.equals("Yes")){
            bankAPI =new YesBankAPIAdapter();
        }
        return bankAPI;
    }
}
