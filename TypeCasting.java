package classes;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int is automatically cast to double
        System.out.println("Implicit Casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value (after implicit casting): " + doubleValue);

        // Explicit Casting (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double is explicitly cast to int
        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + anotherDoubleValue);
        System.out.println("int value (after explicit casting): " + anotherIntValue);

        // Casting with Objects
        Animal animal = new Dog(); // Upcasting (implicit)
        animal.makeSound(); // Calls the overridden method in Dog

        // Downcasting (explicit)
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            dog.bark(); // Calls Dog-specific method
        }
    }
}

// Base class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void bark() {
        System.out.println("Dog barks loudly");
    }
}

