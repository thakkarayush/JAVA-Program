package classes.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Fruit {
    String name;
    int quantity;

    Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + quantity;
    }
}

class QuantityComparator implements Comparator<Fruit> {
    public int compare(Fruit f1, Fruit f2) {
        return Integer.compare(f1.quantity, f2.quantity);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Apple", 10));
        fruits.add(new Fruit("Banana", 20));
        fruits.add(new Fruit("Orange", 5));

        Collections.sort(fruits, new QuantityComparator());
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

