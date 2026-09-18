package strings.assignment_problems;

class WordProf {
    public static void main(String[] args) {
        WordProf wp = new WordProf();
        wp.classify("This movie was absolutely fantastic and thrilling");
    }

    public void classify(String rev) {
        String[] arr = rev.split(" ");
        int s = 0;
        int m = 0;
        int l = 0;

        for (int i = 0; i < arr.length; i++) {
            int len = arr[i].length();

            if (len >= 1 && len <= 4) {
                s++;
            } else if (len >= 5 && len <= 8) {
                m++;
            } else if (len >= 9) {
                l++;
            }
        }

        System.out.println("Short: " + s + " | Medium: " + m + " | Long: " + l);
    }
}