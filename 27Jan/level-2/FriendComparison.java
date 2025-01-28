import java.util.Scanner;

public class FriendComparison {

    public static String findYoungest(int[] ages) {
        int minAge = ages[0];
        String youngestFriend = "Amar";
        
        if (ages[1] < minAge) {
            minAge = ages[1];
            youngestFriend = "Akbar";
        }
        if (ages[2] < minAge) {
            minAge = ages[2];
            youngestFriend = "Anthony";
        }
        return youngestFriend;
    }

    public static String findTallest(double[] heights) {
        double maxHeight = heights[0];
        String tallestFriend = "Amar";
        
        if (heights[1] > maxHeight) {
            maxHeight = heights[1];
            tallestFriend = "Akbar";
        }
        if (heights[2] > maxHeight) {
            maxHeight = heights[2];
            tallestFriend = "Anthony";
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        System.out.println("Enter the age and height of Amar:");
        System.out.print("Age: ");
        ages[0] = scanner.nextInt();
        System.out.print("Height (in cm): ");
        heights[0] = scanner.nextDouble();
        
        System.out.println("Enter the age and height of Akbar:");
        System.out.print("Age: ");
        ages[1] = scanner.nextInt();
        System.out.print("Height (in cm): ");
        heights[1] = scanner.nextDouble();
        
        System.out.println("Enter the age and height of Anthony:");
        System.out.print("Age: ");
        ages[2] = scanner.nextInt();
        System.out.print("Height (in cm): ");
        heights[2] = scanner.nextDouble();
        
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);
        
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
