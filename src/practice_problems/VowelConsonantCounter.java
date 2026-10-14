package practice_problems;
class VowelConsonantCounter {
    public static void countLetters(String word) {
        int vowels = 0;
        int consonants = 0;
        String lowerWord = word.toLowerCase();

        for (int i = 0; i < lowerWord.length(); i++) {
            char ch = lowerWord.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        countLetters("Programming");
    }
}