package classes.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
    	SerializableClass emp = null;

        try (FileInputStream fileIn = new FileInputStream("employee.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            emp = (SerializableClass) in.readObject();
            System.out.println("Deserialized Employee:");
            System.out.println(emp);
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
    }
}

