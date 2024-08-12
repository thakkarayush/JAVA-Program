package classes;

public class GarbageCollection {
    // Attributes
    String name;

    // Constructor
    public GarbageCollection(String name) {
        this.name = name;
    }

    // Method to display object details
    public void display() {
        System.out.println("Object Name: " + name);
    }

    // Override finalize() method
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing: " + name);
        } finally {
            super.finalize(); // Call superclass's finalize method
        }
    }

    public static void main(String[] args) {
        // Create objects
        GarbageCollection obj1 = new GarbageCollection("Object1");
        GarbageCollection obj2 = new GarbageCollection("Object2");

        // Display objects
        obj1.display();
        obj2.display();

        // Set objects to null to make them eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request garbage collection
        System.gc(); // Suggests JVM to perform garbage collection

        // Pause to allow garbage collection to complete
        try {
            Thread.sleep(1000); // Sleep for a while to give GC time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}

