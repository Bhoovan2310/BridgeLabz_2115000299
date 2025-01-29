import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams_11 {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        scanner.close();

        System.out.println(isAnagram(str1, str2) ? "Anagrams" : "Not Anagrams");
    }
}
