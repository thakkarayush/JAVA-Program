package classes;

public class CopyConstructor {
    // Attributes
    int width;
    int height;

    // Parameterized Constructor
    public CopyConstructor(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Copy Constructor
    public CopyConstructor(CopyConstructor other) {
        this.width = other.width;
        this.height = other.height;
    }

    // Method to display rectangle details
    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        CopyConstructor rect1 = new CopyConstructor(10, 5);
        System.out.println("Original Rectangle:");
        rect1.displayDetails();

        // Create a copy of the rect1 object using the copy constructor
        CopyConstructor rect2 = new CopyConstructor(rect1);
        System.out.println("Copied Rectangle:");
        rect2.displayDetails();
    }
}

