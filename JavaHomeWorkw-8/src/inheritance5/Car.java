package inheritance5;
//Write a Java program to create a vehicle class hierarchy. The base class should be
//Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
//properties such as make, model, year, and fuel type. Implement methods for
//calculating fuel efficiency, distance traveled, and maximum speed.

public class Car extends Vehicle {

        public Car (String make , String model , int year , String fuelType){
            super(make, model , year , fuelType);
        }

        public Car() {
            super();
        }

        public double fuelEfficiency(){
            return super.fuelEfficiency();
        }
        public double distanceTraveled(){
            return  super . distanceTraveled() * fuelEfficiency();
        }
        public int maximumSpeed(){
            return super.maximumSpeed();
        }

        public static void main(String[] args) {
            Car c = new Car();
            c.fuelEfficiency();
            c.maximumSpeed();
            c.distanceTraveled();

        }

    }




