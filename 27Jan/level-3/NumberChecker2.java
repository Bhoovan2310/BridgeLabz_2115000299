public class NumberChecker2 {

    public static void main(String[] args) {
        int number = 153;

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int sumOfDigits = sumOfDigits(digits);
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        boolean isHarshad = isHarshadNumber(digits, number);
        int[][] digitFrequency = findDigitFrequency(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad number: " + isHarshad);

        System.out.println("Digit frequencies:");
        for (int i = 0; i < digitFrequency.length; i++) {
            System.out.println("Digit: " + digitFrequency[i][0] + " Frequency: " + digitFrequency[i][1]);
        }
    }

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
}
