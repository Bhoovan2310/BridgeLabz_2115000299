import java.util.Random;

public class FootballTeam {

    public static void main(String[] args) {
        int[] heights = new int[11];
        
        generateRandomHeights(heights);

        int sum = findSum(heights);

        double mean = findMean(sum, heights.length);

        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights of the players in cms: ");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        
        System.out.println("\nShortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }

    public static void generateRandomHeights(int[] heights) {
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
    }

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int sum, int length) {
        return (double) sum / length;
    }

    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
