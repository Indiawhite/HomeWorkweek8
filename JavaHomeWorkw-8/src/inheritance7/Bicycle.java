package inheritance7;
//Write a Java program to create a class Vehicle with a method called speedUp(). Create
//two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
//increase the vehicle's speed differently.


public class Bicycle extends Vehicle {
    public void speedup(){
        super.speedup();
        System.out.println("bicycle speedup unit : 10");
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.speedup();
        System.out.println("bicycle speedup : " + b.fastSpeed());

    }
}
