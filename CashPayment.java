package proj;

public class CashPayment implements paymentStrategy {

    private boolean paidWithCash;

    public boolean isPaidWithCash() {
        return this.paidWithCash;
    }

    public void setPaidWithCash(boolean paidWithCash) {
        this.paidWithCash = paidWithCash;
    }

    @Override
    public void pay(int sum) {

    }

    // Implement methods from the PaymentStrategy interface
    // ...

    // Additional methods related to cash payments
    // ...
}
