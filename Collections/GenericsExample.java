package classes.Collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
