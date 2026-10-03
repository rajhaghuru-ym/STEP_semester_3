package assignment_problems;

interface BusUser {
    double getTransportFee();
}

abstract class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public abstract double getTuitionFee();
}

class DayScholar extends Student implements BusUser {
    public DayScholar(String name) {
        super(name);
    }

    public double getTuitionFee() {
        return 40000.0;
    }

    public double getTransportFee() {
        return 12000.0;
    }
}

class Hosteller extends Student {
    public Hosteller(String name) {
        super(name);
    }

    public double getTuitionFee() {
        return 40000.0 + 60000.0;
    }
}

class ScholarshipStudent extends Student implements BusUser {
    public ScholarshipStudent(String name) {
        super(name);
    }

    public double getTuitionFee() {
        return 20000.0;
    }

    public double getTransportFee() {
        return 12000.0;
    }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new DayScholar("Asha");
        students[1] = new Hosteller("Ravi");
        students[2] = new ScholarshipStudent("Neha");

        double totalCollected = 0;

        for (int i = 0; i < students.length; i++) {
            double totalFee = students[i].getTuitionFee();

            if (students[i] instanceof BusUser) {
                BusUser busUser = (BusUser) students[i];
                totalFee = totalFee + busUser.getTransportFee();
            }

            System.out.printf("%s: %.2f\n", students[i].name, totalFee);
            totalCollected = totalCollected + totalFee;
        }

        System.out.printf("Total Collected: %.2f\n", totalCollected);
    }
}