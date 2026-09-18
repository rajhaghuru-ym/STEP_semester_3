package strings.assignment_problems;

class Streak {
    public static void main(String[] args) {
        Streak st = new Streak();
        st.findLongest("RRGGGYRR");
        st.findLongest("RRRRYYGG");
    }

    public void findLongest(String log) {
        char mc = log.charAt(0);
        int mlen = 1;

        char c = log.charAt(0);
        int len = 1;

        for (int i = 1; i < log.length(); i++) {
            if (log.charAt(i) == c) {
                len++;
            } else {
                if (len > mlen) {
                    mlen = len;
                    mc = c;
                }
                c = log.charAt(i);
                len = 1;
            }
        }

        if (len > mlen) {
            mlen = len;
            mc = c;
        }

        System.out.println("Longest Streak: '" + mc + "' repeated " + mlen + " times");
    }
}