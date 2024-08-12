package classes;

class AnimalInheri {
    void eat() {
        System.out.println("Eating...");
    }
}

class DogInheri extends AnimalInheri {
    void bark() {
        System.out.println("Barking...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
    	DogInheri dog = new DogInheri();
        dog.eat(); // Inherited from Animal class
        dog.bark();
    }
}

