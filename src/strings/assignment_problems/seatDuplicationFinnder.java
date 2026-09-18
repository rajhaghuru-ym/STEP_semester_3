package strings.assignment_problems;

class SeatCheck {
    public static void main(String[] args) {
        SeatCheck sc = new SeatCheck();
        int[] arr1 = {101, 102, 103, 102, 105};
        int[] arr2 = {101, 102, 103, 104, 105};

        sc.checkSeats(arr1);
        sc.checkSeats(arr2);
    }

    void checkSeats(int[] arr) {
        boolean dup = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Seat Number Found: " + arr[i]);
                    dup = true;
                }
            }
        }

        if (!dup) {
            System.out.println("No Duplicate Seats Found");
        }
    }
}


