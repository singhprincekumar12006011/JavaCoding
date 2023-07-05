class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void honk() {
        System.out.println("Honk honk!");
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

// Child class
class Car extends Vehicle {
    private int numOfDoors;

    public Car(String brand, int year, int numOfDoors) {
        super(brand, year); // Call the constructor of the parent class
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Number of doors: " + myCar.getNumOfDoors());
        myCar.honk(); // Inherited method from the Vehicle class
    }
}
