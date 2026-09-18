package strings.assignment_problems;

class Inventory {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        int[] a = {20, 15, 30};
        int[] b = {25, 10, 30};

        inv.analyze(a, b);
    }

    public void analyze(int[] a, int[] b) {
        int sA = 0;
        int sB = 0;
        int max = -1;
        String sec = "";
        int item = -1;

        for (int i = 0; i < a.length; i++) {
            sA = sA + a[i];
            sB = sB + b[i];

            if (a[i] > max) {
                max = a[i];
                sec = "Section A";
                item = i + 1;
            }
            if (b[i] > max) {
                max = b[i];
                sec = "Section B";
                item = i + 1;
            }
        }

        String stat = "";
        if (sA == sB) {
            stat = "Balanced";
        } else {
            stat = "Not Balanced";
        }

        System.out.println("Section A Total: " + sA + " | Section B Total: " + sB + " | Status: " + stat + " | Highest Quantity: " + max + " (" + sec + ", Item " + item + ")");
    }
}
