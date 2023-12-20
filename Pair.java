package proj;

import java.io.Serializable;

public class Pair <T, U >implements Serializable {
    private static final long serialVersionUID = -2293542072123223150L;
    public T first;
    public U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

}
