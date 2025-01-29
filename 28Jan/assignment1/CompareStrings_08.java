import java.util.Scanner;

public class CompareStrings_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        int result = str1.compareTo(str2);
        if (result < 0)
            System.out.println(str1 + " comes before " + str2);
        else if (result > 0)
            System.out.println(str1 + " comes after " + str2);
        else
            System.out.println("Both strings are equal.");
    }
}
