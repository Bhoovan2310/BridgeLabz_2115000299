import java.util.Scanner;

public class ChocolateDistribution_9 {
    public static int[] distributeChocolates(int chocolates, int children) {
        int eachGets = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{eachGets, remaining};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of chocolates and children:");
        int chocolates = scanner.nextInt();
        int children = scanner.nextInt();
        int[] result = distributeChocolates(chocolates, children);
        System.out.println("Each child gets: " + result[0] + ", Remaining chocolates: " + result[1]);
    }
}
