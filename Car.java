public class Car {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle("Hyundai", "Elantra");
    Vehicle v2 = new Vehicle(v1);
    System.out.println("V1: " + v1);
    System.out.println("V2: " + v2);
  }
}

class Vehicle {
  public String make;
  public String model;

  public Vehicle(String make, String model){
    this.make = make;
    this.model = model;
  }
  public Vehicle(Vehicle vehicle){ // Copy constructor
    this.make = vehicle.make;
    this.model = vehicle.model;
  }
  @Override
  public String toString() {
    return "Vehicle [make=" + make + ", model=" + model + "]";
  }
}