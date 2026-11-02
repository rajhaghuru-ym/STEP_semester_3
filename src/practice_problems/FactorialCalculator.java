package practice_problems;

class FactorialCalculator {
    public static void calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }

    public static void main(String[] args) {
        calculateFactorial(5);
        calculateFactorial(0);
    }
}