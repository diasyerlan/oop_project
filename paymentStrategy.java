package proj;

import java.io.Serializable;

public interface paymentStrategy extends Serializable {
    public void pay(int sum);
}
