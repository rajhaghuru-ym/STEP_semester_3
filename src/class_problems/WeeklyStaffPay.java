package class_problems;

abstract class Staff {
    String name;

    public Staff(String name) {
        this.name = name;
    }

    public abstract double getPay();
}

class FullTimeStaff extends Staff {
    double weeklySalary;

    public FullTimeStaff(String name, double weeklySalary) {
        super(name);
        this.weeklySalary = weeklySalary;
    }

    public double getPay() {
        return this.weeklySalary;
    }
}

class HourlyStaff extends Staff {
    double hours;
    double rate;

    public HourlyStaff(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    public double getPay() {
        if (this.hours <= 40) {
            return this.hours * this.rate;
        } else {
            double regularPay = 40 * this.rate;
            double overtimePay = (this.hours - 40) * (this.rate * 1.5);
            return regularPay + overtimePay;
        }
    }
}

class InternStaff extends Staff {
    double stipend;

    public InternStaff(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    public double getPay() {
        return this.stipend;
    }
}

public class WeeklyStaffPay {
    public static void main(String[] args) {
        Staff[] employees = new Staff[3];
        employees[0] = new FullTimeStaff("Asha", 12000);
        employees[1] = new HourlyStaff("Ravi", 45, 200);
        employees[2] = new InternStaff("Neha", 5000);

        double totalPayroll = 0;

        for (int i = 0; i < employees.length; i++) {
            double pay = employees[i].getPay();
            System.out.printf("%s: %.2f\n", employees[i].name, pay);
            totalPayroll = totalPayroll + pay;
        }

        System.out.printf("Total Payroll: %.2f\n", totalPayroll);
    }
}