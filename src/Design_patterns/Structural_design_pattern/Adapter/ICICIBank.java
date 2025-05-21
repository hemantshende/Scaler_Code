package Design_patterns.Structural_design_pattern.Adapter;

public class ICICIBank {

    public int checkBalance(String accountNumber) {
        System.out.println("balance via ICICI");
        return 1000;
    }
}
