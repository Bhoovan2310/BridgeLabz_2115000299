import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        int result = compareStrings(str1, str2);

        if (result < 0)
            System.out.println(str1 + " comes before " + str2);
        else if (result > 0)
            System.out.println(str1 + " comes after " + str2);
        else
            System.out.println("Both strings are equal.");
    }

    static int compareStrings(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return len1 - len2;
    }
}
