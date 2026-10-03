package assignment_problems;

interface NightService {
}

abstract class Cab {
    double km;

    public Cab(double km) {
        this.km = km;
    }

    public abstract double getRate();
    public abstract String getType();

    public double getBaseFare() {
        double fare = this.km * getRate();
        if (fare < 100.0) {
            return 100.0;
        }
        return fare;
    }
}

class MiniCab extends Cab {
    public MiniCab(double km) {
        super(km);
    }

    public double getRate() {
        return 10.0;
    }

    public String getType() {
        return "MINI";
    }
}

class SedanCab extends Cab implements NightService {
    public SedanCab(double km) {
        super(km);
    }

    public double getRate() {
        return 14.0;
    }

    public String getType() {
        return "SEDAN";
    }
}

class SuvCab extends Cab implements NightService {
    public SuvCab(double km) {
        super(km);
    }

    public double getRate() {
        return 18.0;
    }

    public String getType() {
        return "SUV";
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Cab[] trips = new Cab[4];
        trips[0] = new MiniCab(8);
        String time0 = "DAY";

        trips[1] = new SedanCab(10);
        String time1 = "NIGHT";

        trips[2] = new SuvCab(20);
        String time2 = "DAY";

        trips[3] = new MiniCab(5);
        String time3 = "NIGHT";

        Cab[] allTrips = {trips[0], trips[1], trips[2], trips[3]};
        String[] allTimes = {time0, time1, time2, time3};

        double grandTotal = 0;

        for (int i = 0; i < allTrips.length; i++) {
            Cab cab = allTrips[i];
            String time = allTimes[i];

            if (time.equals("NIGHT") && !(cab instanceof NightService)) {
                System.out.printf("%s: night service not available\n", cab.getType());
            } else {
                double fare = cab.getBaseFare();
                if (time.equals("NIGHT")) {
                    fare = fare + (fare * 0.20);
                }
                System.out.printf("%s: %.2f\n", cab.getType(), fare);
                grandTotal = grandTotal + fare;
            }
        }

        System.out.printf("Total: %.2f\n", grandTotal);
    }
}