package assignment_problems;

interface Insurable {
    double getInsuranceAmount();
}

abstract class Parcel {
    double weight;
    double declaredValue;

    public Parcel(double weight, double declaredValue) {
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

    public abstract double getCharge();
    public abstract String getType();
}

class StandardParcel extends Parcel {
    public StandardParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    public double getCharge() {
        return 40.0 + (10.0 * this.weight);
    }

    public String getType() {
        return "STANDARD";
    }
}

class ExpressParcel extends Parcel implements Insurable {
    public ExpressParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    public double getCharge() {
        return 80.0 + (15.0 * this.weight);
    }

    public double getInsuranceAmount() {
        return this.declaredValue * 0.02;
    }

    public String getType() {
        return "EXPRESS";
    }
}

class FragileParcel extends Parcel implements Insurable {
    public FragileParcel(double weight, double declaredValue) {
        super(weight, declaredValue);
    }

    public double getCharge() {
        return 40.0 + (10.0 * this.weight) + 50.0;
    }

    public double getInsuranceAmount() {
        return this.declaredValue * 0.02;
    }

    public String getType() {
        return "FRAGILE";
    }
}

public class ParcelShippingDesk {
    public static void main(String[] args) {
        Parcel[] parcels = new Parcel[3];
        parcels[0] = new StandardParcel(3, 500);
        parcels[1] = new ExpressParcel(2, 1000);
        parcels[2] = new FragileParcel(4, 2000);

        double grandTotal = 0;

        for (int i = 0; i < parcels.length; i++) {
            double charge = parcels[i].getCharge();
            double insurance = 0.0;

            if (parcels[i] instanceof Insurable) {
                insurance = ((Insurable) parcels[i]).getInsuranceAmount();
            }

            double total = charge + insurance;
            System.out.printf("%s: Charge=%.2f Insurance=%.2f Total=%.2f\n",
                    parcels[i].getType(), charge, insurance, total);
            grandTotal = grandTotal + total;
        }

        System.out.printf("Grand Total: %.2f\n", grandTotal);
    }
}