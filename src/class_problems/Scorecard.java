package class_problems;

public class Scorecard {
    private boolean[] results;
    private int recordedCount;

    public Scorecard(int totalQuestions) {
        this.results = new boolean[totalQuestions];
        this.recordedCount = 0;
    }

    public void recordAnswer(boolean result) {
        if (this.recordedCount < this.results.length) {
            this.results[this.recordedCount] = result;
            this.recordedCount = this.recordedCount + 1;
        }
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < this.recordedCount; i++) {
            if (this.results[i] == true) {
                score = score + 1;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println(sc.getScore());
    }
}