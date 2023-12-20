package proj;


import java.io.Serializable;

public class PaymentType <T, U, I>implements Serializable {
    public T first;
    public U second;
    public I third;

    public PaymentType(T first, U second, I third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

}
