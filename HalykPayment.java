package proj;

public class HalykPayment implements paymentStrategy {
    
    private String cardNumber;
    
    private String getCardNumber() {
        return this.cardNumber;
    }
    
    private String setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
