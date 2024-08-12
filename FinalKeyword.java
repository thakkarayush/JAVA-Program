package classes;

class FinalKeywordExample {
    // final variable
    final int maxValue = 100;

    // final method
    final void display() {
        System.out.println("This is a final method.");
    }
}

// final class
final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        FinalKeywordExample example = new FinalKeywordExample();
        System.out.println("Max Value: " + example.maxValue);

        example.display();

        FinalClass finalClass = new FinalClass();
        finalClass.show();
    }
}

