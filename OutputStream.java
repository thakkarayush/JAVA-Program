package classes;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // Open the file
            fos = new FileOutputStream("output.txt");

            // Write a single byte
            fos.write(65);  // Writes the byte representing 'A'
            System.out.println("Wrote single byte: 65 (A)");

            // Write an array of bytes
            byte[] byteArray = {66, 67, 68};  // Represents 'BCD'
            fos.write(byteArray);
            System.out.println("Wrote byte array: {66, 67, 68} (BCD)");

            // Write a portion of an array of bytes
            byte[] anotherArray = {69, 70, 71, 72, 73};  // Represents 'EFGHI'
            fos.write(anotherArray, 1, 3);  // Writes 'FGH'
            System.out.println("Wrote portion of byte array: {70, 71, 72} (FGH)");

            // Flush the stream
            fos.flush();
            System.out.println("Flushed the output stream");

            // Close the file
            fos.close();
            System.out.println("File closed");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

