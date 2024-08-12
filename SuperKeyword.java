package classes;

class AnimalSuper {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class DogSuper extends AnimalSuper {
    @Override
    void eat() {
        System.out.println("Dog is eating...");
    }

    void bark() {
        System.out.println("Dog is barking...");
    }

    void display() {
        // Calling parent class method
        super.eat();
        bark();
    }
}

public class SuperKeyword{
    public static void main(String[] args) {
        DogSuper dog = new DogSuper();
        dog.display();
    }
}

