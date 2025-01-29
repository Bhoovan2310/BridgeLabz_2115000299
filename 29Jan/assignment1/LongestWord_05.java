import java.util.Scanner;

public class LongestWord_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split("\\s+");
        String longest = "";
        
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        System.out.println("Longest Word: " + longest);
    }
}
