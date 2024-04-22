package inheritance7;
//Write a Java program to create a class Vehicle with a method called speedUp(). Create
//two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
//increase the vehicle's speed differently.

public class Car extends Vehicle {
    public void speedup(){
        super.speedup();
        System.out.println("Car speed increased by : 20 ");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.speedup();
        System.out.println("car speed :" +c.fastSpeed() );
    }

}
