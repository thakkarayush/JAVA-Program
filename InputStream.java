package classes;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // Open the file
            fis = new FileInputStream("example.txt");

            // Check how many bytes are available
            System.out.println("Bytes available: " + fis.available());

            // Check if mark/reset is supported
            if (fis.markSupported()) {
                System.out.println("Mark/Reset is supported");
                // Mark the current position in the stream
                fis.mark(100);
                System.out.println("Mark set at position 100");
            } else {
                System.out.println("Mark/Reset is not supported");
            }

            // Read and print first byte
            int byteRead = fis.read();
            System.out.println("First byte read: " + byteRead);

            // Read and print multiple bytes
            byte[] buffer = new byte[10];
            int bytesRead = fis.read(buffer, 0, buffer.length);
            System.out.println("Bytes read into buffer: " + bytesRead);
            System.out.print("Buffer contents: ");
            for (int i = 0; i < bytesRead; i++) {
                System.out.print(buffer[i] + " ");
            }
            System.out.println();

            // Reset to the mark, if supported
            if (fis.markSupported()) {
                fis.reset();
                System.out.println("Stream reset to mark");
            }

            // Close the file
            fis.close();
            System.out.println("File closed");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

