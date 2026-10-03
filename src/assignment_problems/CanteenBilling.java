package assignment_problems;

abstract class Customer {
    double amount;

    public Customer(double amount) {
        this.amount = amount;
    }

    public abstract double getFinalAmount();
    public abstract String getType();
}

class Student extends Customer {
    public Student(double amount) {
        super(amount);
    }

    public double getFinalAmount() {
        return this.amount - (this.amount * 0.10);
    }

    public String getType() {
        return "STUDENT";
    }
}

class Staff extends Customer {
    public Staff(double amount) {
        super(amount);
    }

    public double getFinalAmount() {
        return this.amount - (this.amount * 0.05);
    }

    public String getType() {
        return "STAFF";
    }
}

class Guest extends Customer {
    public Guest(double amount) {
        super(amount);
    }

    public double getFinalAmount() {
        return this.amount + 10.00;
    }

    public String getType() {
        return "GUEST";
    }
}

public class CanteenBilling {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Student(200);
        customers[1] = new Staff(300);
        customers[2] = new Guest(150);

        double grandTotal = 0;

        for (int i = 0; i < customers.length; i++) {
            double finalAmount = customers[i].getFinalAmount();
            System.out.printf("%s: %.2f\n", customers[i].getType(), finalAmount);
            grandTotal = grandTotal + finalAmount;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
    }
}