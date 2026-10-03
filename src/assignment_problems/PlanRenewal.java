package assignment_problems;

import java.time.LocalDate;

abstract class Subscriber {
    String name;
    LocalDate startDate;

    public Subscriber(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public abstract LocalDate getRenewalDate();
}

class BasicPlan extends Subscriber {
    public BasicPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    public LocalDate getRenewalDate() {
        return this.startDate.plusDays(30);
    }
}

class StandardPlan extends Subscriber {
    public StandardPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    public LocalDate getRenewalDate() {
        return this.startDate.plusDays(90);
    }
}

class PremiumPlan extends Subscriber {
    public PremiumPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    public LocalDate getRenewalDate() {
        return this.startDate.plusDays(365);
    }
}

public class PlanRenewal {
    public static void main(String[] args) {
        Subscriber[] subscribers = new Subscriber[4];
        subscribers[0] = new BasicPlan("Asha", LocalDate.parse("2024-01-15"));
        subscribers[1] = new StandardPlan("Ravi", LocalDate.parse("2024-02-01"));
        subscribers[2] = new PremiumPlan("Neha", LocalDate.parse("2024-03-10"));
        subscribers[3] = new BasicPlan("Kiran", LocalDate.parse("2024-12-20"));

        for (int i = 0; i < subscribers.length; i++) {
            System.out.println(subscribers[i].name + ": " + subscribers[i].getRenewalDate());
        }
    }
}