import java.util.Scanner;

public class FriendComparison_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i+1) + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of friend " + (i+1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        int youngest = ages[0];
        int youngestIndex = 0;
        double tallest = heights[0];
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
                youngestIndex = i;
            }
            if (heights[i] > tallest) {
                tallest = heights[i];
                tallestIndex = i;
            }
        }

        System.out.println("Youngest Friend: Friend " + (youngestIndex + 1));
        System.out.println("Tallest Friend: Friend " + (tallestIndex + 1));
    }
}
