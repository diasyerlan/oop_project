package proj;

public class KaspiPay implements paymentStrategy {
    
    private String phoneNumber;
    
    private String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    private String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
