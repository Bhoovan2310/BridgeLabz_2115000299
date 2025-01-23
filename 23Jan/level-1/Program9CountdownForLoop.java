import java.util.Scanner;

public class Program9CountdownForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = input.nextInt();

        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
    }
}
