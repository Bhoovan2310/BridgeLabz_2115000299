public class CountingSortAges {
    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 13, 12, 11, 15};
        countingSort(ages, 10, 18);

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }

    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        for (int age : arr) {
            count[age - min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}
