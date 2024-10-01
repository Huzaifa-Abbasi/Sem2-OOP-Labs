/*Vehicle Inheritance:
 Create a class named Vehicle with attributes like model, year, and color.
 Create subclasses for Car, Motorcycle, and Truck inheriting from Vehicle.
 Add specific attributes and methods for each vehicle type (e.g., numberOfDoors for Car, 
engineCapacity for Motorcycle).
 Implement a method to display vehicle details for each type */


class Vehicle{
    String model;
    int year;
    String colour;

    public Vehicle(String model, int year, String colour){
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public void displayInfo(){
        System.out.println("Model: "+ model);
        System.out.println("Year: "+ year);
        System.out.println("Colour: "+ colour);

    }


}

class Car extends Vehicle{
    int numberOfDoors;

    public Car(String model, int year, String colour, int numberOfDoors){
        super(model, year, colour);
        this.numberOfDoors=numberOfDoors;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: "+ numberOfDoors);
    }


}

class Bike extends Vehicle{
    int engineCapacity;

    public Bike(String model, int year, String colour, int engineCapacity){
        super(model, year, colour);
        this.engineCapacity = engineCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Engin Capacity"+ engineCapacity+"Hp");
    }
}

class Truck extends Vehicle{
    int Capacity;

    public Truck(String model, int year, String colour, int Capacity){
        super(model, year, colour);
        this.Capacity = Capacity;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The Truck Capacity Is: "+Capacity+"Tons");
    }
}


public class VehicleInheritance {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car("CIvic", 2002, "Black", 4);
        vehicles[1] = new Bike("125", 2014, "Purple", 60);
        vehicles[2] = new Truck("003", 2024, "Blue", 1000);

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            
        }
    }
}
