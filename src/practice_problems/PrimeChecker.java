package practice_problems;

class PrimeChecker {
    public static void checkPrime(int number) {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }

    public static void main(String[] args) {
        checkPrime(29);
        checkPrime(21);
    }
}