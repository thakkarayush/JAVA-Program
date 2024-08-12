package classes;

class AnimalMulti {
    void eat() {
        System.out.println("Eating...");
    }
}

class DogMulti extends AnimalMulti {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends DogMulti {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.eat();  // Inherited from Animal class
        babyDog.bark(); // Inherited from Dog class
        babyDog.weep();
    }
}

