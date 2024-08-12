package classes;

class AnimalHie {
    void eat() {
        System.out.println("Eating...");
    }
}

class DogHie extends AnimalHie {
    void bark() {
        System.out.println("Barking...");
    }
}

class CatHie extends AnimalHie {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        DogHie dog = new DogHie();
        dog.eat();  // Inherited from Animal class
        dog.bark();

        CatHie cat = new CatHie();
        cat.eat();  // Inherited from Animal class
        cat.meow();
    }
}

