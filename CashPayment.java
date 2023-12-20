package proj;

public class CashPayment implements paymentStrategy {



    @Override
    public void pay(int sum) {
        System.out.println("Payment of " + sum + " KZT made in cash.");
    }

    public String toString() {
        return "Cash";
    }

}