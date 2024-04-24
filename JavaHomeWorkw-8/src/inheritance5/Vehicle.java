package inheritance5;
//Write a Java program to create a vehicle class hierarchy. The base class should be
//Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have
//properties such as make, model, year, and fuel type. Implement methods for
//calculating fuel efficiency, distance traveled, and maximum speed.

public class Vehicle {
    public String make;
    public String model;
    public int year;
    public String fuelType;


    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public Vehicle() {

    }

    public double fuelEfficiency(){
        return 0.0;
        }
     public  double distanceTraveled(){
        return 0.0;
     }

     public int maximumSpeed(){
        return 0;
     }
    public String getMake() { return make;}

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }
    }




