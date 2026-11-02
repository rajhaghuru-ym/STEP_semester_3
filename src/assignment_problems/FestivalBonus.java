package assignment_problems;

abstract class Employee {
    String name;
    double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public abstract double getBonus();
}

class FullTime extends Employee {
    public FullTime(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    public double getBonus() {
        return this.monthlySalary * 0.10;
    }
}

class PartTime extends Employee {
    public PartTime(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    public double getBonus() {
        return this.monthlySalary * 0.05;
    }
}

class Intern extends Employee {
    public Intern(String name, double monthlySalary) {
        super(name, monthlySalary);
    }

    public double getBonus() {
        return 2000.00;
    }
}

public class FestivalBonus {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTime("Asha", 50000);
        employees[1] = new PartTime("Ravi", 30000);
        employees[2] = new Intern("Neha", 15000);

        double grandTotal = 0;

        for (int i = 0; i < employees.length; i++) {
            double bonus = employees[i].getBonus();
            System.out.printf("%s: %.2f\n", employees[i].name, bonus);
            grandTotal = grandTotal + bonus;
        }

        System.out.printf("Total Bonus: %.2f\n", grandTotal);
    }
}