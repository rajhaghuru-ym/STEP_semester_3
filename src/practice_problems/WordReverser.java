package practice_problems;

class WordReverser {
    public static void checkPalindrome(String word) {
        StringBuilder builder = new StringBuilder(word);
        String reversed = builder.reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " - palindrome");
        } else {
            System.out.println(reversed + " - not a palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("level");
        checkPalindrome("java");
    }
}