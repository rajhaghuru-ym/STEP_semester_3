package assignment_problems;

import java.util.Arrays;

class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    public int compareTo(Player other) {
        if (this.battingAverage > other.battingAverage) {
            return -1;
        } else if (this.battingAverage < other.battingAverage) {
            return 1;
        }
        return 0;
    }
}

public class AutoDraftEngine {
    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    public static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && injured == false;
    }

    public static String draftAndRank(Player[] players) {
        Player[] temp = new Player[players.length];
        int count = 0;

        for (int i = 0; i < players.length; i++) {
            boolean eligible = false;

            if (isDraftable(players[i].matchesPlayed)) {
                eligible = true;
            } else if (isDraftable(players[i].matchesPlayed, players[i].injured)) {
                eligible = true;
            }

            if (eligible) {
                temp[count] = players[i];
                count = count + 1;
            }
        }

        Player[] draftable = new Player[count];
        for (int i = 0; i < count; i++) {
            draftable[i] = temp[i];
        }

        Arrays.sort(draftable);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            result.append(i + 1).append(". ").append(draftable[i].name);

            if (i < draftable.length - 1) {
                result.append(" | ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}