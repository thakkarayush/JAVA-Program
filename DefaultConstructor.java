package classes;

public class DefaultConstructor {
    // Attributes
    String make;
    String model;
    int year;
    String color;

    // Default Constructor
    public DefaultConstructor() {
        // Initialize attributes with default values
        make = "Unknown";
        model = "Unknown";
        year = 0;
        color = "Unknown";
    }

    // Parameterized Constructor
    public DefaultConstructor(String make, String model, int year, String color) {
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
        // Create objects using the default constructor
        DefaultConstructor defaultCar = new DefaultConstructor();
        defaultCar.displayDetails();

        System.out.println();

        // Create objects using the parameterized constructor
        DefaultConstructor specificCar = new DefaultConstructor("Honda", "Civic", 2019, "Blue");
        specificCar.displayDetails();
    }
}

