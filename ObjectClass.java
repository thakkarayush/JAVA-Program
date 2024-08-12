package classes;
public class ObjectClass {
    // Attributes
    String make;
    String model;
    int year;
    String color;

    // Constructor
    public ObjectClass(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Methods
    public void start() {
        System.out.println(model + " is starting.");
    }

    public void stop() {
        System.out.println(model + " is stopping.");
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        // Create objects of the Car class
        ObjectClass car1 = new ObjectClass("Toyota", "Corolla", 2020, "Red");
        ObjectClass car2 = new ObjectClass("Honda", "Civic", 2019, "Blue");

        // Use methods of the Car class
        car1.displayDetails();
        car1.start();
        car1.stop();

        System.out.println();

        car2.displayDetails();
        car2.start();
        car2.stop();
    }
}
