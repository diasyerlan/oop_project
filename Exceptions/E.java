package proj.Exceptions;

public class E {
    public static void validateH_index(int h_index) throws H_indexException {
        if (h_index < 3) {
            // Throw the custom exception with a specific message
            throw new H_indexException("H-index of Researcher must be more than 3!");
        }
    }
    public static void validateIter(int c, int i) throws iterExceedException {
        if (c > i) {
            // Throw the custom exception with a specific message
            throw new iterExceedException("Incorrect input! Try again!");
        }
    }
}
