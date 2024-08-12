package classes;

abstract class AnimalAbstract {
    // Abstract method (does not have a body)
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Eating...");
    }
}

class DogAbstract extends AnimalAbstract {
    // Providing implementation for the abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

class CatAbstract extends AnimalAbstract {
    // Providing implementation for the abstract method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Abstract {
    public static void main(String[] args) {
        AnimalAbstract myDog = new DogAbstract();
        myDog.sound();  // Calls the sound method of Dog class
        myDog.eat();    // Calls the eat method of Animal class

        AnimalAbstract myCat = new CatAbstract();
        myCat.sound();  // Calls the sound method of Cat class
        myCat.eat();    // Calls the eat method of Animal class
    }
}
