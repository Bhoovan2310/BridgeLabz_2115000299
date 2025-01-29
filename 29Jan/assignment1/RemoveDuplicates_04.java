import java.util.Scanner;

public class RemoveDuplicates_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) { 
                result += ch;
            }
        }
        System.out.println("Modified String: " + result);
    }
}
