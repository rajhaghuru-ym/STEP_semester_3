package class_problems;

public class GridOptimizer {
    public static double rowAverage(int[] row) {
        double sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum = sum + row[i];
        }
        return sum / row.length;
    }

    public static String classifyRows(int[][] seatingScores, int threshold) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]);

            result.append("Row ").append(i).append(": ");
            if (avg >= threshold) {
                result.append("Buzzing Zone");
            } else {
                result.append("Quiet Zone");
            }

            if (i < seatingScores.length - 1) {
                result.append(" | ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[][] seatingScores = {
                {40, 50, 45},
                {85, 90, 95},
                {30, 20, 25}
        };
        System.out.println(classifyRows(seatingScores, 60));
    }
}