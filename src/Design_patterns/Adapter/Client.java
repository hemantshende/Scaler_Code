package Design_patterns.Adapter;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName= scanner.nextLine();
        RBIBankAPI bankAPI=RBIBankAdapterFactory.getbankApiAdapter(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);
        phonePe.reachargeFastag(120);
    }
}
