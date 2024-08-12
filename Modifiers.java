package classes;

//Public class (accessible from any other class)
public class Modifiers {

 // Static variable (shared among all instances of the class)
 static int staticVar = 10;

 // Final variable (constant, cannot be modified)
 final int finalVar = 20;

 // Private variable (accessible only within this class)
 private int privateVar = 30;

 // Protected variable (accessible within the same package or subclasses)
 protected int protectedVar = 40;

 // Method with public access modifier
 public void publicMethod() {
     System.out.println("Public Method");
     System.out.println("Static Variable: " + staticVar);
     System.out.println("Final Variable: " + finalVar);
     System.out.println("Private Variable: " + privateVar); // Accessible here
     System.out.println("Protected Variable: " + protectedVar);
 }

 // Method with private access modifier
 private void privateMethod() {
     System.out.println("Private Method");
 }

 // Final method (cannot be overridden in subclasses)
 public final void finalMethod() {
     System.out.println("Final Method");
 }

 // Static method (belongs to the class, not instances)
 public static void staticMethod() {
     System.out.println("Static Method");
 }

 // Abstract method (must be implemented by subclasses)
 // Uncommenting the below method will cause an error because abstract methods can't be in a non-abstract class
 // abstract void abstractMethod();

 public static void main(String[] args) {
     // Creating an object of ModifiersExample
     Modifiers example = new Modifiers();
     
     // Accessing public method
     example.publicMethod();
     
     // Accessing static method without creating an instance
     Modifiers.staticMethod();
     
     // Accessing private method directly (will cause error if uncommented)
     // example.privateMethod();
     
     // Accessing final method (cannot be overridden in subclasses)
     example.finalMethod();
 }
}
