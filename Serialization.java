package proj;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Vector;

/**
 * The `Serialization` class provides methods for reading and writing objects to/from files using serialization.
 */
public class Serialization {

    /**
     * Writes a Vector of Serializable objects to a file.
     *
     * @param data     The Vector of Serializable objects to be written.
     * @param fileName The name of the file to write to.
     * @param <T>      The type of the Serializable objects in the Vector.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public static <T extends Serializable> void write(Vector<T> data, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            oos.flush();
        }
    }

    /**
     * Writes a HashMap of Serializable objects to a file.
     *
     * @param data     The HashMap of Serializable objects to be written.
     * @param fileName The name of the file to write to.
     * @param <T>      The type of the keys in the HashMap.
     * @param <M>      The type of the Serializable objects in the HashMap.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public static <T, M extends Serializable> void write(HashMap<T, M> data, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            oos.flush();
        }
    }

    /**
     * Writes a LinkedHashMap of Serializable objects to a file.
     *
     * @param data     The LinkedHashMap of Serializable objects to be written.
     * @param fileName The name of the file to write to.
     * @param <T>      The type of the keys in the LinkedHashMap.
     * @param <M>      The type of the Serializable objects in the LinkedHashMap.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public static <T, M extends Serializable> void write(LinkedHashMap<T, M> data, String fileName) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(data);
            oos.flush();
        }
    }

    /**
     * Reads a Vector of Serializable objects from a file.
     *
     * @param fileName The name of the file to read from.
     * @param <T>      The type of the Serializable objects in the Vector.
     * @return A Vector of Serializable objects read from the file.
     */
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

    /**
     * Reads a HashMap of Serializable objects from a file.
     *
     * @param fileName The name of the file to read from.
     * @param s        A String parameter for method overloading.
     * @param <T>      The type of the keys in the HashMap.
     * @param <M>      The type of the Serializable objects in the HashMap.
     * @return A HashMap of Serializable objects read from the file.
     */
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

    /**
     * Reads a LinkedHashMap of Serializable objects from a file.
     *
     * @param fileName The name of the file to read from.
     * @param s        An int parameter for method overloading.
     * @param <T>      The type of the keys in the LinkedHashMap.
     * @param <M>      The type of the Serializable objects in the LinkedHashMap.
     * @return A LinkedHashMap of Serializable objects read from the file.
     */
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

