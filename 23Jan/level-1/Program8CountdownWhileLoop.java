import java.util.Scanner;

public class Program8CountdownWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int counter = input.nextInt();

        while (counter > 0) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");
    }
}
