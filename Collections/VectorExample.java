package classes.Collections;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}

