import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Long> fibonacciMemo = new ArrayList<>();

    static {
        fibonacciMemo.add(0L);
        fibonacciMemo.add(1L);
    }

    public Long dynamicProgramming(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (fibonacciMemo.size() > n) {
            return fibonacciMemo.get(n);
        }
        while (fibonacciMemo.size() <= (n + 1)){
            int lastComputedIndex = fibonacciMemo.size() - 1;
            int prevToLastComputedIndex = fibonacciMemo.size() - 2;
            long currentFibonacci = fibonacciMemo.get(lastComputedIndex) + fibonacciMemo.get(prevToLastComputedIndex);
            fibonacciMemo.add(currentFibonacci);
        }
            return fibonacciMemo.get(n);
    }

    public long recursion(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n<=1) {
            return n;
        }
        return recursion(n-1) + recursion(n-2);

    }

    public long iteration(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n == 0 || n == 1) {
            return n;
        }
        long fibonacci = 0;
        long prev = 1;
        long prev2 = 0;
        for (int i = 2; i <= n; i++) {
            fibonacci = prev + prev2;
            prev2 = prev;
            prev = fibonacci;
        }
        return fibonacci;
    }
}
