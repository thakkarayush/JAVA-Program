package classes;

import java.io.FileNotFoundException;
import java.io.IOException;

class ParentOE {
    void show() throws IOException {
        System.out.println("Parent class show method");
    }
}

class ChildOE extends ParentOE {
    @Override
    void show() throws FileNotFoundException { // FileNotFoundException is a subclass of IOException
        System.out.println("Child class show method");
    }
}

public class OverridingWithException {
    public static void main(String[] args) {
        ParentOE p = new ChildOE();
        try {
            p.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

