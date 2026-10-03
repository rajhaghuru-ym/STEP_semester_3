package assignment_problems;

abstract class Room {
    double units;

    public Room(double units) {
        this.units = units;
    }

    public abstract double getBill();
    public abstract String getType();
}

class SingleRoom extends Room {
    public SingleRoom(double units) {
        super(units);
    }

    public double getBill() {
        return this.units * 8.0;
    }

    public String getType() {
        return "SINGLE";
    }
}

class SharedRoom extends Room {
    int occupants;

    public SharedRoom(double units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    public double getBill() {
        return (this.units * 6.0) / this.occupants;
    }

    public String getType() {
        return "SHARED";
    }
}

class AcRoom extends Room {
    public AcRoom(double units) {
        super(units);
    }

    public double getBill() {
        return (this.units * 10.0) + 200.0;
    }

    public String getType() {
        return "AC";
    }
}

public class HostelElectricityBill {
    public static void main(String[] args) {
        Room[] rooms = new Room[3];
        rooms[0] = new SingleRoom(120);
        rooms[1] = new SharedRoom(150, 3);
        rooms[2] = new AcRoom(100);

        double grandTotal = 0;

        for (int i = 0; i < rooms.length; i++) {
            double bill = rooms[i].getBill();
            System.out.printf("%s: %.2f\n", rooms[i].getType(), bill);
            grandTotal = grandTotal + bill;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
    }
}