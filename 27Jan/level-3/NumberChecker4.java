public class NumberChecker4 {

    public static void main(String[] args) {
        int number = 28;

        boolean isPrime = isPrimeNumber(number);
        boolean isNeon = isNeonNumber(number);
        boolean isSpy = isSpyNumber(number);
        boolean isAutomorphic = isAutomorphicNumber(number);
        boolean isBuzz = isBuzzNumber(number);

        System.out.println("Number: " + number);
        System.out.println("Is Prime: " + isPrime);
        System.out.println("Is Neon: " + isNeon);
        System.out.println("Is Spy: " + isSpy);
        System.out.println("Is Automorphic: " + isAutomorphic);
        System.out.println("Is Buzz: " + isBuzz);
    }

    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }
}
