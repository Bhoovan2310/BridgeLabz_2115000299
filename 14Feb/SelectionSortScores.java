public class SelectionSortScores {
    public static void main(String[] args) {
        int[] scores = {85, 70, 95, 60, 90, 75};
        selectionSort(scores);

        for (int score : scores) {
            System.out.print(score + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
