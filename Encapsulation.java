package classes;

//Class definition with encapsulation
class Employee {
 // Private fields
 private String name;
 private int age;
 private double salary;

 // Constructor
 public Employee(String name, int age, double salary) {
     this.name = name;
     this.age = age;
     this.salary = salary;
 }

 // Getter method for name
 public String getName() {
     return name;
 }

 // Setter method for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter method for age
 public int getAge() {
     return age;
 }

 // Setter method for age
 public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("Invalid age. Age must be positive.");
     }
 }

 // Getter method for salary
 public double getSalary() {
     return salary;
 }

 // Setter method for salary
 public void setSalary(double salary) {
     if (salary >= 0) {
         this.salary = salary;
     } else {
         System.out.println("Invalid salary. Salary cannot be negative.");
     }
 }

 // Method to display employee details
 public void displayEmployeeDetails() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Salary: " + salary);
 }
}

//Main class to demonstrate encapsulation
public class Encapsulation {
 public static void main(String[] args) {
     // Creating an Employee object
     Employee employee = new Employee("John Doe", 30, 50000);

     // Displaying initial employee details
     System.out.println("Initial Employee Details:");
     employee.displayEmployeeDetails();

     // Modifying employee details using setter methods
     employee.setName("Jane Doe");
     employee.setAge(35);
     employee.setSalary(60000);

     // Displaying updated employee details
     System.out.println("\nUpdated Employee Details:");
     employee.displayEmployeeDetails();

     // Attempting to set invalid values
     employee.setAge(-5);
     employee.setSalary(-10000);
 }
}

