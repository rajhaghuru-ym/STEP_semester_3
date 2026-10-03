package assignment_problems;

import java.util.HashMap;
import java.util.ArrayList;

public class WordFrequencyReport {
    public void printFilteredWordFrequency(String feedback) {
        String cleaned = feedback.replace(".", "").replace(",", "").toLowerCase();
        String[] words = cleaned.split("\\s+");

        HashMap<String, Integer> counts = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.equals("the") || word.equals("was") || word.equals("and") ||
                    word.equals("a") || word.equals("is") || word.equals("of") ||
                    word.equals("in") || word.isEmpty()) {
                continue;
            }

            if (counts.containsKey(word)) {
                counts.put(word, counts.get(word) + 1);
            } else {
                counts.put(word, 1);
            }
        }

        ArrayList<String> uniqueWords = new ArrayList<>(counts.keySet());

        for (int i = 0; i < uniqueWords.size(); i++) {
            for (int j = i + 1; j < uniqueWords.size(); j++) {
                String word1 = uniqueWords.get(i);
                String word2 = uniqueWords.get(j);

                if (counts.get(word2) > counts.get(word1)) {
                    uniqueWords.set(i, word2);
                    uniqueWords.set(j, word1);
                }
            }
        }

        for (int i = 0; i < uniqueWords.size(); i++) {
            String word = uniqueWords.get(i);
            System.out.println(word + ": " + counts.get(word));
        }
    }

    public static void main(String[] args) {
        WordFrequencyReport report = new WordFrequencyReport();
        report.printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}