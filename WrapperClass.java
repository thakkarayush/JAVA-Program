package classes;

public class WrapperClass {
    public static void main(String[] args) {
        // Creating wrapper class objects
        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.valueOf(12.34);
        Boolean boolObj = Boolean.valueOf(true);

        // Autoboxing: automatic conversion of primitive to wrapper object
        Integer autoBoxedInt = 200;
        Double autoBoxedDouble = 23.45;
        Boolean autoBoxedBool = false;

        // Unboxing: automatic conversion of wrapper object to primitive
        int intValue = intObj;
        double doubleValue = doubleObj;
        boolean boolValue = boolObj;

        // Using wrapper class methods
        int parsedInt = Integer.parseInt("300");
        String doubleToString = doubleObj.toString();
        boolean boolValueFromString = Boolean.parseBoolean("true");

        // Displaying the values
        System.out.println("Wrapper class objects:");
        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Boolean: " + boolObj);

        System.out.println("\nAutoboxed values:");
        System.out.println("Integer: " + autoBoxedInt);
        System.out.println("Double: " + autoBoxedDouble);
        System.out.println("Boolean: " + autoBoxedBool);

        System.out.println("\nUnboxed values:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + boolValue);

        System.out.println("\nUsing wrapper class methods:");
        System.out.println("Parsed int: " + parsedInt);
        System.out.println("Double to String: " + doubleToString);
        System.out.println("Boolean value from String: " + boolValueFromString);
    }
}

