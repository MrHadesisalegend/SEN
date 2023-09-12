package exercise3;

class Vehicle {
    private double weight;
    private double length;
    private String registrationNumber;

    public Vehicle(double weight, double length, String registrationNumber) {
        this.weight = weight;
        this.length = length;
        this.registrationNumber = registrationNumber;
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Other methods relevant to Vehicle

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [Weight: " + weight + " kg, Length: " + length + " m, Reg. No.: " + registrationNumber + "]";
    }
}

class Bus extends Vehicle {
    public Bus(double weight, double length, String registrationNumber) {
        super(weight, length, registrationNumber);
        if (weight < 5000.0 || weight > 20000.0) {
            throw new IllegalArgumentException("Bus weight out of range");
        }
        if (length < 4.0 || length > 10.0) {
            throw new IllegalArgumentException("Bus length out of range");
        }
        if (registrationNumber.length() > 8) {
            throw new IllegalArgumentException("Bus registrationNumber length exceeded");
        }
    }
    // Additional methods relevant to Bus
}

class Car extends Vehicle {
    public Car(double weight, double length, String registrationNumber) {
        super(weight, length, registrationNumber);
        if (weight < 1000.0 || weight > 2000.0) {
            throw new IllegalArgumentException("Car weight out of range");
        }
        if (length < 1.5 || length > 3.5) {
            throw new IllegalArgumentException("Car length out of range");
        }
        if (registrationNumber.length() > 6) {
            throw new IllegalArgumentException("Car registrationNumber length exceeded");
        }
    }
    // Additional methods relevant to Car
}

public class TestVehicleHierarchy {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1500.0, 2.5, "ABC123");
        Bus bus = new Bus(12000.0, 8.0, "XYZ789");
        Car car = new Car(1500.0, 2.0, "DEF456");

        System.out.println(vehicle);
        System.out.println(bus);
        System.out.println(car);
    }
}

