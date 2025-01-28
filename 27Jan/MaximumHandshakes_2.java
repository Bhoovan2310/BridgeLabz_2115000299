import java.util.Scanner;

public class MaximumHandshakes_2 {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();
        System.out.println("Maximum number of handshakes: " + calculateHandshakes(n));
    }
}
