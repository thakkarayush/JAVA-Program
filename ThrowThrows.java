package classes;

import java.io.FileReader;
import java.io.IOException;

public class ThrowThrows {

    // Method using throws
    public static void readFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
    }

    public static void main(String[] args) {
        // Using throw keyword
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Handling method with throws
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    // Method to check age using throw keyword
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be at least 18");
        } else {
            System.out.println("Welcome!");
        }
    }
}

