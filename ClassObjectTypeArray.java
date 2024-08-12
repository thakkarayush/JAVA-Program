package classes;

//Point class definition
class Point {
 int x, y;

 // Constructor
 Point(int x, int y) {
     this.x = x;
     this.y = y;
 }

 // Method to display point details
 void display() {
     System.out.println("Point (" + x + ", " + y + ")");
 }
}

//Main class to demonstrate object arrays
public class ClassObjectTypeArray {
 public static void main(String[] args) {
     // Array of Point objects
     Point[] points = new Point[3];
     
     // Initializing Point objects
     points[0] = new Point(1, 2);
     points[1] = new Point(3, 4);
     points[2] = new Point(5, 6);

     // Display Point objects
     System.out.println("Array of Point objects:");
     for (Point point : points) {
         point.display();
     }
 }
}

