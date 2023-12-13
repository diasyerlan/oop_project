package proj;

public class CashPayment implements PaymentStrategy {

    private boolean paidWithCash;

    public boolean isPaidWithCash() {
        return this.paidWithCash;
    }

    public void setPaidWithCash(boolean paidWithCash) {
        this.paidWithCash = paidWithCash;
    }

    // Implement methods from the PaymentStrategy interface
    // ...

    // Additional methods related to cash payments
    // ...
}
