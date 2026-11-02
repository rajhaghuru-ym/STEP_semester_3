package class_problems;

abstract class Delivery {
    double weight;
    double distance;

    public Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public abstract double calculateFee();
    public abstract String getType();
}

class StandardDelivery extends Delivery {
    public StandardDelivery(double weight, double distance) {
        super(weight, distance);
    }

    public double calculateFee() {
        return 5.00 + (0.50 * this.weight) + (0.10 * this.distance);
    }

    public String getType() {
        return "STANDARD";
    }
}

class ExpressDelivery extends Delivery {
    public ExpressDelivery(double weight, double distance) {
        super(weight, distance);
    }

    public double calculateFee() {
        return 15.00 + (1.00 * this.weight) + (0.20 * this.distance);
    }

    public String getType() {
        return "EXPRESS";
    }
}

class InternationalDelivery extends Delivery {
    double customsFee;

    public InternationalDelivery(double weight, double distance, double customsFee) {
        super(weight, distance);
        this.customsFee = customsFee;
    }

    public double calculateFee() {
        return 25.00 + (2.00 * this.weight) + (0.50 * this.distance) + this.customsFee;
    }

    public String getType() {
        return "INTERNATIONAL";
    }
}

public class DeliveryCalculator {
    public static void main(String[] args) {
        Delivery[] deliveries = new Delivery[3];
        deliveries[0] = new StandardDelivery(10, 50);
        deliveries[1] = new ExpressDelivery(5, 20);
        deliveries[2] = new InternationalDelivery(20, 100, 30);

        double grandTotal = 0;

        for (int i = 0; i < deliveries.length; i++) {
            double fee = deliveries[i].calculateFee();
            System.out.printf("%s: %.2f\n", deliveries[i].getType(), fee);
            grandTotal = grandTotal + fee;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
    }
}