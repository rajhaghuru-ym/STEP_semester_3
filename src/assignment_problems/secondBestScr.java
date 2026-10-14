package assignment_problems;

class SecondBestScore {

    public static int secondHighest(int[] scores) {
        int highest = -1;
        int secondHighest = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) {
                secondHighest = highest;
                highest = scores[i];
            } else if (scores[i] > secondHighest && scores[i] != highest) {
                secondHighest = scores[i];
            }
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        int[] scores1 = {45, 78, 92, 78, 60};
        System.out.println(secondHighest(scores1));

        int[] scores2 = {50, 50, 50};
        System.out.println(secondHighest(scores2));
    }
}