public class Searchin2DSortedMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix[0].length-1 * matrix.length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (midValue == target) {
                return true;
            } else if (midValue > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
}