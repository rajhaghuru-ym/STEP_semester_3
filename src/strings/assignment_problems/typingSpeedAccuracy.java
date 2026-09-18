package strings.assignment_problems;

class TypeTest {
    public static void main(String[] args) {
        TypeTest tt = new TypeTest();
        tt.checkAcc("hello world", "hello worlt");
        tt.checkAcc("coding", "coding");
    }

    public void checkAcc(String o, String t) {
        int m = 0;
        int pos = -1;
        int len = o.length();

        for (int i = 0; i < len; i++) {
            if (o.charAt(i) == t.charAt(i)) {
                m++;
            } else if (pos == -1) {
                pos = i + 1;
            }
        }

        double pct = (m * 100.0) / len;

        if (pos == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches\n", m, len, pct);
        } else {
            char oChar = o.charAt(pos - 1);
            char tChar = t.charAt(pos - 1);
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')\n", m, len, pct, pos, oChar, tChar);
        }
    }
}