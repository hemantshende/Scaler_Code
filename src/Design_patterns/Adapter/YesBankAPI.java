package Design_patterns.Adapter;

public class YesBankAPI{
    public int getbalance(String accountNumber) {
        System.out.println("balance via YesBank");
        return 1000;
    }
}
