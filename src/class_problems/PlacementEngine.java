package class_problems;

import java.util.Arrays;

class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    public double getCompositeScore() {
        return (this.cgpa * 10) + (this.codingScore * 0.5);
    }

    public int compareTo(Candidate other) {
        double thisScore = this.getCompositeScore();
        double otherScore = other.getCompositeScore();

        if (thisScore > otherScore) {
            return -1;
        } else if (thisScore < otherScore) {
            return 1;
        }
        return 0;
    }
}

public class PlacementEngine {
    public static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    public static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    public static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] temp = new Candidate[candidates.length];
        int count = 0;

        for (int i = 0; i < candidates.length; i++) {
            boolean eligible = false;

            if (isEligible(candidates[i].cgpa)) {
                eligible = true;
            } else if (isEligible(candidates[i].cgpa, candidates[i].codingScore)) {
                eligible = true;
            }

            if (eligible) {
                temp[count] = candidates[i];
                count = count + 1;
            }
        }

        Candidate[] shortlisted = new Candidate[count];
        for (int i = 0; i < count; i++) {
            shortlisted[i] = temp[i];
        }

        Arrays.sort(shortlisted);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < shortlisted.length; i++) {
            result.append(i + 1).append(". ").append(shortlisted[i].name)
                    .append(" (").append(shortlisted[i].getCompositeScore()).append(")");

            if (i < shortlisted.length - 1) {
                result.append(" | ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
                new Candidate("Aisha", 8.2, 40),
                new Candidate("Rohit", 6.8, 65),
                new Candidate("Meena", 6.0, 90),
                new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}