package classes;

import java.io.*;

public class CheckedUnchecked {
    public static void main(String[] args) {
        // Checked Exception (IOException)
        try {
            FileReader file = new FileReader("test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Unchecked Exception (ArrayIndexOutOfBoundsException)
        try {
            int[] arr = new int[5];
            int num = arr[10]; // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

