package inheritance8;
//Write a Java program to create a class Employee with a method called
//calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
//override the calculateSalary() method to calculate and return the salary based on their
//specific roles.
public class Manager extends Employee {
    public void calculateSalary(){
        System.out.println("Manager Salary is £40000");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.calculateSalary();
    }
}
