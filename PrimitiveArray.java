package classes;

public class PrimitiveArray {
    public static void main(String[] args) {
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
    }
}

