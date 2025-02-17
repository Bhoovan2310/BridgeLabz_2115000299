public class FibonacciComparison {

    public static int fibonacciRecursive(int n) {
        if (n <= 1)
            return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] testCases = { 10, 30, 50 };
        for (int n : testCases) {
            System.out.println("Fibonacci for N = " + n);

            long start = System.nanoTime();
            int resultRecursive = fibonacciRecursive(n);
            long timeRecursive = System.nanoTime() - start;
            System.out.println("Recursive Time: " + timeRecursive / 1e6 + " ms");

            start = System.nanoTime();
            int resultIterative = fibonacciIterative(n);
            long timeIterative = System.nanoTime() - start;
            System.out.println("Iterative Time: " + timeIterative / 1e6 + " ms");
        }
    }
}
