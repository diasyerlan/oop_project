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
        System.out.println("Payment of " + sum + " KZT made in cash.");
        setPaidWithCash(true);
    }

    public String toString() {
        return "Cash";
    }

}