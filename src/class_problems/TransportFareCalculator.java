package class_problems;

abstract class Transport {
    double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();
    public abstract String getType();
}

class Bus extends Transport {
    public Bus(double distance) {
        super(distance);
    }

    public double calculateFare() {
        double fare = 2.00 + (0.10 * this.distance);
        if (fare > 10.00) {
            return 10.00;
        }
        return fare;
    }

    public String getType() {
        return "BUS";
    }
}

class Train extends Transport {
    public Train(double distance) {
        super(distance);
    }

    public double calculateFare() {
        return 3.00 + (0.15 * this.distance);
    }

    public String getType() {
        return "TRAIN";
    }
}

class Metro extends Transport {
    double peakHourFactor;

    public Metro(double distance, double peakHourFactor) {
        super(distance);
        this.peakHourFactor = peakHourFactor;
    }

    public double calculateFare() {
        return (1.50 + (0.20 * this.distance)) * this.peakHourFactor;
    }

    public String getType() {
        return "METRO";
    }
}

public class TransportFareCalculator {
    public static void main(String[] args) {
        Transport[] journeys = new Transport[3];
        journeys[0] = new Bus(15);
        journeys[1] = new Train(50);
        journeys[2] = new Metro(10, 1.5);

        double grandTotal = 0;

        for (int i = 0; i < journeys.length; i++) {
            double fare = journeys[i].calculateFare();
            System.out.printf("%s: %.2f\n", journeys[i].getType(), fare);
            grandTotal = grandTotal + fare;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
    }
}