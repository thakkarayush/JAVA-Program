package classes;

interface AnimalInterface {
    // Abstract method
    void sound();

    // Default method
    default void eat() {
        System.out.println("Eating...");
    }
}

class DogInterface implements AnimalInterface {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("Dog barks");
    }
}

class CatInterface implements AnimalInterface {
    // Providing implementation for the abstract method
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Interface {
    public static void main(String[] args) {
        AnimalInterface myDog = new DogInterface();
        myDog.sound();  // Calls the sound method of Dog class
        myDog.eat();    // Calls the default eat method of Animal interface

        AnimalInterface myCat = new CatInterface();
        myCat.sound();  // Calls the sound method of Cat class
        myCat.eat();    // Calls the default eat method of Animal interface
    }
}
