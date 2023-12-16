package proj;

import java.io.*;
import java.util.Vector;

public class Serialization {
    public static <T extends Serializable> void write(Vector<T> data, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            oos.flush();
        }
    }

    public static <T extends Serializable> Vector<T> read(String fileName) {
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Vector<T>) oin.readObject();
        } catch (EOFException e) {
            return null;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
