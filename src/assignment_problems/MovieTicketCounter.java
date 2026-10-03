package assignment_problems;

abstract class TicketBooking {
    int count;

    public TicketBooking(int count) {
        this.count = count;
    }

    public abstract double getBasePrice();
    public abstract String getType();

    public double getTotalAmount() {
        return (getBasePrice() + 20.0) * this.count;
    }
}

class RegularBooking extends TicketBooking {
    public RegularBooking(int count) {
        super(count);
    }

    public double getBasePrice() {
        return 150.0;
    }

    public String getType() {
        return "REGULAR";
    }
}

class PremiumBooking extends TicketBooking {
    public PremiumBooking(int count) {
        super(count);
    }

    public double getBasePrice() {
        return 250.0;
    }

    public String getType() {
        return "PREMIUM";
    }
}

class ReclinerBooking extends TicketBooking {
    public ReclinerBooking(int count) {
        super(count);
    }

    public double getBasePrice() {
        return 400.0;
    }

    public String getType() {
        return "RECLINER";
    }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        TicketBooking[] bookings = new TicketBooking[3];
        bookings[0] = new RegularBooking(3);
        bookings[1] = new PremiumBooking(2);
        bookings[2] = new ReclinerBooking(1);

        double grandTotal = 0;

        for (int i = 0; i < bookings.length; i++) {
            double amount = bookings[i].getTotalAmount();
            System.out.printf("%s: %.2f\n", bookings[i].getType(), amount);
            grandTotal = grandTotal + amount;
        }

        System.out.printf("Total: %.2f\n", grandTotal);
    }
}