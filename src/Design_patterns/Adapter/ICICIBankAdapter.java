package Design_patterns.Adapter;

public class ICICIBankAdapter implements RBIBankAPI{
    private ICICIBank iciciBank=new ICICIBank();
    @Override
    public int balance(String accountNumber) {
        return iciciBank.checkBalance("");
    }
}
