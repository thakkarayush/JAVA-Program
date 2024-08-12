package classes;

interface AnimalMultiple {
    void eat();
}

interface Pet {
    void play();
}

class DogMultiple implements AnimalMultiple, Pet {
    public void eat() {
        System.out.println("Eating...");
    }

    public void play() {
        System.out.println("Playing...");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        DogMultiple dog = new DogMultiple();
        dog.eat();  // Method from Animal interface
        dog.play(); // Method from Pet interface
    }
}

