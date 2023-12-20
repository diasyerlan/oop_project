package proj;

import java.io.Serializable;

public class KaspiPay implements paymentStrategy, Serializable {
    private static final long serialVersionUID = 6955694358215306790L;
    private String phoneNumber;
    public KaspiPay(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
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
        System.out.println("Payment of " + sum + " KZT made using KaspiPay for phone number " + phoneNumber);
    }

    public String toString() {
        return "Kaspi";
    }
}
