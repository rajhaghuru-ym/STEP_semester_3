package practice_problems;

class Student {
    String name;
    int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        return sum / marks.length;
    }

    public String getGrade(double average) {
        if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public void printResult() {
        double average = calculateAverage();
        String grade = getGrade(average);
        String upperName = this.name.toUpperCase();

        System.out.printf("%s: Average %.1f, Grade %s\n", upperName, average, grade);
    }
}

 class ResultCardGenerator {
    public static void main(String[] args) {
        int[] ashaMarks = {80, 90, 70};
        Student asha = new Student("Asha", ashaMarks);
        asha.printResult();

        int[] raviMarks = {60, 55, 50};
        Student ravi = new Student("Ravi", raviMarks);
        ravi.printResult();
    }
}