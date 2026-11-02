package assignment_problems;

abstract class Vehicle {
    int hours;

    public Vehicle(int hours) {
        this.hours = hours;
    }

    public abstract double getCharge();
    public abstract String getType();
}

class Bike extends Vehicle {
    public Bike(int hours) {
        super(hours);
    }

    public double getCharge() {
        return this.hours * 10.0;
    }

    public String getType() {
        return "BIKE";
    }
}

class Car extends Vehicle {
    public Car(int hours) {
        super(hours);
    }

    public double getCharge() {
        if (this.hours == 1) {
            return 30.0;
        }
        return 30.0 + ((this.hours - 1) * 20.0);
    }

    public String getType() {
        return "CAR";
    }
}

class Truck extends Vehicle {
    public Truck(int hours) {
        super(hours);
    }

    public double getCharge() {
        double charge = this.hours * 50.0;
        if (charge < 100.0) {
            return 100.0;
        }
        return charge;
    }

    public String getType() {
        return "TRUCK";
    }
}

public class ParkingCalculator {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Bike(3);
        vehicles[1] = new Car(4);
        vehicles[2] = new Truck(1);
        vehicles[3] = new Car(1);

        double grandTotal = 0;

        for (int i = 0; i < vehicles.length; i++) {
            double charge = vehicles[i].getCharge();
            System.out.printf("%s: %.2f\n", vehicles[i].getType(), charge);
            grandTotal = grandTotal + charge;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
    }
}