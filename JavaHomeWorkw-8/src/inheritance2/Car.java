package inheritance2;
/*Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car that overrides the drive() method to print "Repairing a
car".*/

public class Car extends Vehicle {
        public void drive() {
            System.out.println("Repairing a car");

        }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
