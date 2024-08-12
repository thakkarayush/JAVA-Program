package classes;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Parent class that reads content from a file
class FileIOParent {
    void performIO() throws IOException {
        File file = new File("input.txt");
        FileReader fr = new FileReader(file);
        
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}

// Child class that writes content to a file
class FileIOChild extends FileIOParent {
    @Override
    void performIO() throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("This is an example of file writing using FileWriter.\n");
        fw.write("File I/O operations in Java are simple and powerful.");
        fw.close();
    }
}

public class FIleIO {
    public static void main(String[] args) {
        // Reading from a file using the parent class
        FileIOParent parent = new FileIOParent();
        try {
            System.out.println("Reading from input.txt:");
            parent.performIO();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to a file using the child class
        FileIOParent child = new FileIOChild();
        try {
            System.out.println("\n\nWriting to output.txt:");
            child.performIO();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

