package classes;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            int num = arr[10]; // This will cause an ArrayIndexOutOfBoundsException
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
