package proj;

public class KaspiPay implements paymentStrategy {

    private String phoneNumber;
    public KaspiPay() {
        phoneNumber = "";
    }
    private String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int sum) {

    }
}
