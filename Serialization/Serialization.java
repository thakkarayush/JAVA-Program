package classes.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
    	SerializableClass emp = new SerializableClass("John Doe", 1234);

        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(emp);
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

