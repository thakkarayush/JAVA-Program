package classes;

public class ParameterisedConstructor {
    // Attributes
    String title;
    String author;
    int yearPublished;
    double price;

    // Parameterized Constructor
    public ParameterisedConstructor(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Create objects using the parameterized constructor
        ParameterisedConstructor book1 = new ParameterisedConstructor("To Kill a Mockingbird", "Harper Lee", 1960, 15.99);
        ParameterisedConstructor book2 = new ParameterisedConstructor("1984", "George Orwell", 1949, 12.99);

        // Display book details
        book1.displayDetails();
        System.out.println();
        book2.displayDetails();
    }
}

