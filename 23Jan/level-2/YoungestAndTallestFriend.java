import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Amar's height in cm: ");
        double heightAmar = scanner.nextDouble();
        System.out.print("Enter Akbar's height in cm: ");
        double heightAkbar = scanner.nextDouble();
        System.out.print("Enter Anthony's height in cm: ");
        double heightAnthony = scanner.nextDouble();
        int youngestAge = Math.min(Math.min(ageAmar, ageAkbar), ageAnthony);
        String youngest = (youngestAge == ageAmar) ? "Amar" :
                          (youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        double tallestHeight = Math.max(Math.max(heightAmar, heightAkbar), heightAnthony);
        String tallest = (tallestHeight == heightAmar) ? "Amar" :
                         (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";
        System.out.println("The youngest friend is " + youngest + " with age " + youngestAge + ".");
        System.out.println("The tallest friend is " + tallest + " with height " + tallestHeight + " cm.");
    }
}
