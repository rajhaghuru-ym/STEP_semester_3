package strings.class_problems;

class BMI {
    public static void main(String[] args) {
        double[] h = {1.75, 1.60, 1.80, 1.65, 1.70};
        double[] w = {70.0, 90.0, 75.0, 50.0, 85.0};

        printRep(h, w);
    }

    public static String getStat(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void printRep(double[] h, double[] w) {
        for (int i = 0; i < h.length; i++) {
            double bmi = w[i] / (h[i] * h[i]);
            String stat = getStat(bmi);
            System.out.println("Person " + (i + 1) + " | H: " + h[i] + " | W: " + w[i] + " | BMI: " + bmi + " | Status: " + stat);
        }
    }
}