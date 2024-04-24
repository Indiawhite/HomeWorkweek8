package inheritance5;
//Write a Java program to create a vehicle class hierarchy. The base class should be
//Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
//properties such as make, model, year, and fuel type. Implement methods for
//calculating fuel efficiency, distance traveled, and maximum speed.

public class Motorcycle extends Vehicle {

        public Motorcycle (String make , String model , int year , String fuelType){
            super(make, model , year , fuelType);
        }

        public Motorcycle() {
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
            Motorcycle m = new Motorcycle();
            m.fuelEfficiency();
            m.maximumSpeed();
            m.distanceTraveled();

        }

    }


