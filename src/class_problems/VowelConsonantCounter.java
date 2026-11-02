package class_problems;

public class VowelConsonantCounter {

    public void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        // Convert everything to lowercase so we don't have to check capital letters
        String lowerText = text.toLowerCase();

        // Basic for-loop to check each character one by one
        for (int i = 0; i < lowerText.length(); i++) {
            char c = lowerText.charAt(i);

            if (c == ' ') {
                continue; // Skip spaces
            }

            // Check if it is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels = vowels + 1;
            }
            // Otherwise, check if it is a normal letter (consonant)
            else if (c >= 'a' && c <= 'z') {
                consonants = consonants + 1;
            }
        }

        System.out.println("Vowels: " + vowels + " | Consonants: " + consonants);
    }

    public static void main(String[] args) {
        VowelConsonantCounter counter = new VowelConsonantCounter();
        counter.countVowelsAndConsonants("Java Programming");
    }
}