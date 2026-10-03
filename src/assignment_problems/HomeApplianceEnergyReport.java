package assignment_problems;

interface SaverMode {
}

abstract class Appliance {
    double hours;

    public Appliance(double hours) {
        this.hours = hours;
    }

    public abstract double getPower();
    public abstract String getType();

    public double getBaseUnits() {
        return (getPower() * this.hours) / 1000.0;
    }
}

class Fridge extends Appliance {
    public Fridge(double hours) {
        super(hours);
    }

    public double getPower() {
        return 150.0;
    }

    public String getType() {
        return "FRIDGE";
    }
}

class AirConditioner extends Appliance implements SaverMode {
    public AirConditioner(double hours) {
        super(hours);
    }

    public double getPower() {
        return 1500.0;
    }

    public String getType() {
        return "AC";
    }
}

class Television extends Appliance {
    public Television(double hours) {
        super(hours);
    }

    public double getPower() {
        return 100.0;
    }

    public String getType() {
        return "TV";
    }
}

class Washer extends Appliance implements SaverMode {
    public Washer(double hours) {
        super(hours);
    }

    public double getPower() {
        return 500.0;
    }

    public String getType() {
        return "WASHER";
    }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Appliance[] appliances = new Appliance[4];
        appliances[0] = new Fridge(24);
        boolean saver0 = false;

        appliances[1] = new AirConditioner(8);
        boolean saver1 = true;

        appliances[2] = new Television(5);
        boolean saver2 = false;

        appliances[3] = new Washer(2);
        boolean saver3 = true;

        Appliance[] allAppliances = {appliances[0], appliances[1], appliances[2], appliances[3]};
        boolean[] allSavers = {saver0, saver1, saver2, saver3};

        double totalCost = 0;

        for (int i = 0; i < allAppliances.length; i++) {
            Appliance app = allAppliances[i];
            boolean isSaverRequested = allSavers[i];

            if (isSaverRequested && !(app instanceof SaverMode)) {
                System.out.printf("%s: saver mode not supported\n", app.getType());
            } else {
                double units = app.getBaseUnits();
                if (isSaverRequested) {
                    units = units - (units * 0.25);
                }
                double cost = units * 8.0;
                System.out.printf("%s: Units=%.2f Cost=%.2f\n", app.getType(), units, cost);
                totalCost = totalCost + cost;
            }
        }

        System.out.printf("Total Cost: %.2f\n", totalCost);
    }
}