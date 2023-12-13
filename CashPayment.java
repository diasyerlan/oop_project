package proj;





public class CashPayment implements paymentStrategy {
    
    
    
    
    private Boolean payedWithCash;
    
    
    
    
    
    
    private Boolean getPayedWithCash() {
        return this.payedWithCash;
    }
    
    
    
    
    private Boolean setPayedWithCash(Boolean payedWithCash) {
        this.payedWithCash = payedWithCash;
    }
    
}
