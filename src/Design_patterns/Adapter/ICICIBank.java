package Design_patterns.Adapter;

public class ICICIBank {

    public int checkBalance(String accountNumber) {
        System.out.println("balance via ICICI");
        return 1000;
    }
}
