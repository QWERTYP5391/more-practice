import java.util.HashMap;

public class Fibonacci {

    public static void main(String[] args) {
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

        int solution = getFibonacci(7, memo);

        System.out.println(solution);
    }

    private static int getFibonacci(int n, HashMap<Integer, Integer> memo) {
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
