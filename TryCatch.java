package classes;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}
