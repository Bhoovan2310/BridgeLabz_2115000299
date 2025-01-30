import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.next();
        System.out.print("Enter new word: ");
        String newWord = scanner.next();
        scanner.close();

        System.out.println("Modified Sentence: " + sentence.replace(oldWord, newWord));
    }
}
