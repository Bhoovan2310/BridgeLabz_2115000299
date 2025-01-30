import java.util.Scanner;

public class CheckAnagrams {
    public static boolean isAnagram(String str1, String str2) {
        int[] freq = new int[256];

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (char ch : str1.toCharArray()) {
            if (ch != ' ')
                freq[ch]++;
        }
        for (char ch : str2.toCharArray()) {
            if (ch != ' ')
                freq[ch]--;
        }

        for (int count : freq) {
            if (count != 0)
                return false;
        }
        return true;
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
