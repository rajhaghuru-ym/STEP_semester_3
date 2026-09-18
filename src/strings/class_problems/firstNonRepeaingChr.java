package strings.class_problems;

class UniqueChar {
    public static void main(String[] args) {
        String s1 = "swiss";
        String s2 = "aabbcc";

        char c1 = findChar(s1);
        System.out.println(s1 + " -> " + c1);

        char c2 = findChar(s2);
        System.out.println(s2 + " -> " + c2);
    }

    public static char findChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    count++;
                }
            }

            if (count == 1) {
                return c;
            }
        }
        return ' ';
    }
}