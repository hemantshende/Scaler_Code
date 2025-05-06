package Machine_Coding.ParkingLot.model;

import java.util.Date;

public class Payment extends Base_Entity{
    private int amount;
    private Payment_Mode paymentMode;
    private Payment_Status paymentStatus;
    private Date time;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Payment_Mode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(Payment_Mode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Payment_Status getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Payment_Status paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
