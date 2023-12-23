package proj;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Vector;

public class Serialization {
    public static <T extends Serializable> void write(Vector<T> data, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            oos.flush();
        }
    }
    public static <T, M extends Serializable> void write(HashMap<T, M> data, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            oos.flush();
        }
    }
    public static <T, M extends Serializable> void write(LinkedHashMap<T, M> data, String fileName) throws IOException {
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

    public static <T, M extends Serializable> HashMap<T, M> read(String fileName, String s) {
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(fileName))) {
            return (HashMap<T, M>) oin.readObject();
        } catch (EOFException e) {
            return null;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static <T, M extends Serializable> LinkedHashMap<T, M> read(String fileName, int s) {
        try (ObjectInputStream oin = new ObjectInputStream(new FileInputStream(fileName))) {
            return (LinkedHashMap<T, M>) oin.readObject();
        } catch (EOFException e) {
            return null;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
