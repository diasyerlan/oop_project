package proj;

/**
 * A class representing a payment strategy for cash payments.
 * Implements the paymentStrategy interface.
 */
public class CashPayment implements paymentStrategy {

    /**
     * Makes a payment in cash.
     *
     * @param sum The amount to be paid in KZT.
     */
    @Override
    public void pay(int sum) {
        System.out.println("Payment of " + sum + " KZT made in cash.");
    }

    /**
     * Returns a string representation of the payment strategy.
     *
     * @return A string representation of the payment strategy ("Cash").
     */
    @Override
    public String toString() {
        return "Cash";
    }
}