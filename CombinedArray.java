package classes;

//Point class definition
class Point1 {
 int x, y;

 // Constructor
 Point1(int x, int y) {
     this.x = x;
     this.y = y;
 }

 // Method to display point details
 void display() {
     System.out.println("Point (" + x + ", " + y + ")");
 }
}

public class CombinedArray {
 public static void main(String[] args) {
     // Primitive type arrays

     // Single-dimensional array
     byte[] arrayOfBytes = {1, 2, 3, 4, 5};
     
     // Two-dimensional array (array of arrays)
     byte[][] arrayOfArrayOfBytes = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
     };

     // Display single-dimensional array
     System.out.println("Single-dimensional array:");
     for (byte b : arrayOfBytes) {
         System.out.print(b + " ");
     }
     System.out.println();

     // Display two-dimensional array
     System.out.println("\nTwo-dimensional array:");
     for (byte[] row : arrayOfArrayOfBytes) {
         for (byte b : row) {
             System.out.print(b + " ");
         }
         System.out.println();
     }

     // Object type arrays

     // Array of Point objects
     Point[] points = new Point[3];
     
     // Initializing Point objects
     points[0] = new Point(1, 2);
     points[1] = new Point(3, 4);
     points[2] = new Point(5, 6);

     // Display Point objects
     System.out.println("\nArray of Point objects:");
     for (Point point : points) {
         point.display();
     }
 }
}

