package classes;

class MathOperations {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        System.out.println("Sum of 2 and 3: " + mathOps.add(2, 3));
        System.out.println("Sum of 2, 3 and 4: " + mathOps.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + mathOps.add(2.5, 3.5));
    }
}
