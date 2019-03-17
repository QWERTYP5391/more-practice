import java.util.HashMap;

public class Fibonacci {

    public static int getFibonacci(int n) {
        return getFibonacci(n, new HashMap<>());
    }


    private static int getFibonacci(int n, HashMap<Integer, Integer> memo) {
        if (memo == null) {
            return 0;
        }
        if (memo.get(n) != null) {
            return memo.get(n);
        } else if (n < 2) {
            memo.put(n, n);
            return n;
        }

        memo.put(n, getFibonacci(n - 1, memo) + getFibonacci(n - 2, memo));

        return memo.get(n);
    }
}
