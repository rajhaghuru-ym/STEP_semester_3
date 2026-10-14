package practice_problems;

class EvenOddCounter {
    public static void countEvenOdd(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }

    public static void main(String[] args) {
        int[] list = {3, 8, 12, 5, 7, 10};
        countEvenOdd(list);
    }
}