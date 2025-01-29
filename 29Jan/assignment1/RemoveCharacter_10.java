import java.util.Scanner;

public class RemoveCharacter_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        String result = str.replace(Character.toString(ch), "");
        System.out.println("Modified String: " + result);
    }
}
