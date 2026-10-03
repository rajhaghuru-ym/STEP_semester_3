package class_problems;

abstract class Connection {
    double units;

    public Connection(double units) {
        this.units = units;
    }

    public abstract double getBill();
    public abstract String getType();
}

class HomeConnection extends Connection {
    public HomeConnection(double units) {
        super(units);
    }

    public double getBill() {
        if (this.units <= 100) {
            return this.units * 5.0;
        } else {
            return (100 * 5.0) + ((this.units - 100) * 7.0);
        }
    }

    public String getType() {
        return "HOME";
    }
}

class ShopConnection extends Connection {
    public ShopConnection(double units) {
        super(units);
    }

    public double getBill() {
        return (this.units * 8.0) + 100.0;
    }

    public String getType() {
        return "SHOP";
    }
}

class FactoryConnection extends Connection {
    public FactoryConnection(double units) {
        super(units);
    }

    public double getBill() {
        double bill = this.units * 6.0;
        if (bill < 1000.0) {
            return 1000.0;
        }
        return bill;
    }

    public String getType() {
        return "FACTORY";
    }
}

public class ElectricityBilling {
    public static void main(String[] args) {
        Connection[] connections = new Connection[3];
        connections[0] = new HomeConnection(150);
        connections[1] = new ShopConnection(90);
        connections[2] = new FactoryConnection(120);

        double totalBill = 0;

        for (int i = 0; i < connections.length; i++) {
            double bill = connections[i].getBill();
            System.out.printf("%s: %.2f\n", connections[i].getType(), bill);
            totalBill = totalBill + bill;
        }

        System.out.printf("Total: %.2f\n", totalBill);
    }
}