public class NumberChecker3 {

    public static void main(String[] args) {
        int number = 121;

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        boolean areEqual = compareArrays(digits, reversedDigits);
        boolean isPalindrome = isPalindrome(digits);
        boolean isDuck = isDuckNumber(digits);

        System.out.println("Number: " + number);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        System.out.println();
        System.out.println("Are digits and reversed digits equal: " + areEqual);
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuck);
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

    public static int[] reverseDigits(int[] digits) {
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}
