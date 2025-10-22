package Week5;

public class Car {
    // Attributes
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void display() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Display the car's details
        myCar.display();
    }
}

