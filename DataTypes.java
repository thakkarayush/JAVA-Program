package classes;

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteValue = 100;
        short shortValue = 10000;
        int intValue = 100000;
        long longValue = 10000000000L;
        float floatValue = 10.5f;
        double doubleValue = 20.99;
        char charValue = 'A';
        boolean booleanValue = true;

        // Reference Data Types
        String stringValue = "Hello, Java!";
        int[] intArray = {1, 2, 3, 4, 5};

        // Displaying Primitive Data Types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        // Displaying Reference Data Types
        System.out.println("\nReference Data Types:");
        System.out.println("String: " + stringValue);

        System.out.print("Array of int: ");
        for (int number : intArray) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
