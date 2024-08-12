package classes;

import java.io.IOException;

class Parent {
    void display() throws IOException {
        System.out.println("Parent display method");
    }
}

class Child extends Parent {
    @Override
    void display() throws IOException {
        System.out.println("Child display method");
    }
}

public class MethodOverridingWithException {
    public static void main(String[] args) {
        Parent p = new Child();
        try {
            p.display();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

