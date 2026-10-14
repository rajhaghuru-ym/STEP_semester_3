package practice_problems;

 class DigitOperations {
    public static void processNumber(int number) {
        int sum = 0;
        int reversed = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            reversed = (reversed * 10) + digit;
            temp = temp / 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reversed);
    }

    public static void main(String[] args) {
        processNumber(4721);
    }
}