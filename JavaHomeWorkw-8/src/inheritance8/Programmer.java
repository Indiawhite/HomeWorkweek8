package inheritance8;
//Write a Java program to create a class Employee with a method called
//calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
//override the calculateSalary() method to calculate and return the salary based on their
//specific roles

public class Programmer extends Employee{
    public void calculateSalary(){
        System.out.println("Programmer salary is £42000");
    }

    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.calculateSalary();
    }
}
