package proj;
/**
 * The HalykPayment class represents a payment strategy using Halyk Bank.
 * It implements the paymentStrategy interface and includes functionality for payments
 * using a specified card number.
 */
public class HalykPayment implements paymentStrategy {
    private String cardNumber;
    /**
     * Constructs a HalykPayment with the specified card number.
     *
     * @param cardNumber The card number associated with the HalykPayment.
     */
    private String getCardNumber() {
        return this.cardNumber;
    }
    public HalykPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    /**
     * Constructs a HalykPayment with an empty card number.
     */
    public HalykPayment() {
        this.cardNumber = "";
    }
    /**
     * Sets the card number associated with the HalykPayment.
     *
     * @param cardNumber The new card number to be set.
     */
    private void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    /**
     * Performs a payment using HalykPayment for the specified sum.
     *
     * @param sum The amount to be paid.
     */
    @Override
    public void pay(int sum) {
        System.out.println("Payment of " + sum + " KZT made using HalykPayment for card number " + cardNumber);
    }
    /**
     * Returns the string representation of the HalykPayment.
     *
     * @return The string "Halyk".
     */
    public String toString() {
        return "Halyk";
    }

}