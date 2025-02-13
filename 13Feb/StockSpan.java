import java.util.Stack;

class StockSpan {
    static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && prices[s.peek()] <= prices[i]) s.pop();
            span[i] = s.isEmpty() ? i + 1 : i - s.peek();
            s.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = calculateSpan(prices);
        for (int s : span) System.out.print(s + " ");
    }
}
