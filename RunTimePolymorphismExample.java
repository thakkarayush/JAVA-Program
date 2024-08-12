package classes;

class AnimalPoly {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class DogPoly extends AnimalPoly {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends AnimalPoly {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTimePolymorphismExample {
    public static void main(String[] args) {
        AnimalPoly myAnimal;
        
        myAnimal = new DogPoly();
        myAnimal.sound(); // Calls the sound method of Dog class
        
        myAnimal = new Cat();
        myAnimal.sound(); // Calls the sound method of Cat class
    }
}

