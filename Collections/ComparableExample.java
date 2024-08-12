package classes.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class FruitC implements Comparable<FruitC> {
    String name;
    int quantity;

    FruitC(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(FruitC other) {
        return Integer.compare(this.quantity, other.quantity);
    }

    @Override
    public String toString() {
        return name + ": " + quantity;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<FruitC> fruits = new ArrayList<>();
        fruits.add(new FruitC("Apple", 10));
        fruits.add(new FruitC("Banana", 20));
        fruits.add(new FruitC("Orange", 5));

        Collections.sort(fruits);
        for (FruitC fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

