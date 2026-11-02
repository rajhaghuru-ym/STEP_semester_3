package assignment_problems;


class DutyRosterRotation {

    public static String[] rotateRoster(String[] names, int k) {
        int n = names.length;
        int actualK = k % n;
        String[] rotated = new String[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + actualK) % n;
            rotated[newIndex] = names[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        String[] names1 = {"A", "B", "C", "D", "E"};
        String[] result1 = rotateRoster(names1, 2);

        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        String[] names2 = {"A", "B", "C", "D", "E"};
        String[] result2 = rotateRoster(names2, 7);

        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();
    }
}