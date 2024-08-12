package classes;

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
    }
}

