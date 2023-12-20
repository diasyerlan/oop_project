package proj;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Transcript implements Serializable {
    private static final long serialVersionUID = 6179535416250479673L;
    public HashMap<Integer, HashMap<Course, Mark>> transcript;

    public Transcript() {
        transcript = new HashMap<>();
}
    // Operations

    @Override
    public String toString() {
        return "";
    }


    }

