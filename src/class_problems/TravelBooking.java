package class_problems;

abstract class Booking {
    double distance;

    public Booking(double distance) {
        this.distance = distance;
    }

    public abstract double getBaseFare();
    public abstract String getMode();

    public double getTotalFare() {
        return getBaseFare() + 50.00;
    }
}

class BusBooking extends Booking {
    public BusBooking(double distance) {
        super(distance);
    }

    public double getBaseFare() {
        return this.distance * 2.0;
    }

    public String getMode() {
        return "BUS";
    }
}

class TrainBooking extends Booking {
    public TrainBooking(double distance) {
        super(distance);
    }

    public double getBaseFare() {
        return this.distance * 1.5;
    }

    public String getMode() {
        return "TRAIN";
    }
}

class FlightBooking extends Booking {
    public FlightBooking(double distance) {
        super(distance);
    }

    public double getBaseFare() {
        return 2500.00 + (this.distance * 4.0);
    }

    public String getMode() {
        return "FLIGHT";
    }
}

public class TravelBooking {
    public static void main(String[] args) {
        Booking[] bookings = new Booking[3];
        bookings[0] = new BusBooking(200);
        bookings[1] = new TrainBooking(300);
        bookings[2] = new FlightBooking(500);

        for (int i = 0; i < bookings.length; i++) {
            System.out.printf("%s: %.2f\n", bookings[i].getMode(), bookings[i].getTotalFare());
        }
    }
}