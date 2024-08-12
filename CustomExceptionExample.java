package classes;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            validate(13);
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    static void validate(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is not valid to vote");
        } else {
            System.out.println("Welcome to vote!");
        }
    }
}

