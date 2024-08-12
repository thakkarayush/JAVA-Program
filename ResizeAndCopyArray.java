package classes;

public class ResizeAndCopyArray {
    public static void main(String[] args) {
        // Initial array with size 5
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(originalArray);

        // Resize the array to size 10
        int newSize = 10;
        int[] resizedArray = resizeArray(originalArray, newSize);
        System.out.println("\nResized array (size " + newSize + "):");
        printArray(resizedArray);

        // Copying array using System.arraycopy
        int[] copiedArray = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        System.out.println("\nCopied array using System.arraycopy:");
        printArray(copiedArray);
    }

    // Method to resize an array
    public static int[] resizeArray(int[] original, int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < original.length && i < newArray.length; i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }

    // Method to print array elements
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

