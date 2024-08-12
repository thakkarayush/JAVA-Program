package classes;

class Student {
    int id;
    String name;

    // Constructor using 'this' to refer to instance variables
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student student = new Student(101, "Ayush");
        student.display();
    }
}
