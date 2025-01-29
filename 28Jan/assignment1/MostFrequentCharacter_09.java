import java.util.Scanner;

public class MostFrequentCharacter_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        char mostFrequent = ' ';
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ch;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
