package inheritance7;
//Write a Java program to create a class Vehicle with a method called speedUp(). Create
//two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
//increase the vehicle's speed differently.


public class Vehicle {
    public int speed;
    public void speedup(){
        speed += 60;
    }
    public int fastSpeed(){
        return speed;
    }

}
